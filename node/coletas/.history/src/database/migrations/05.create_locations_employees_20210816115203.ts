import Knex from 'knex';

export async function up(knex: Knex) {
    return knex.schema.createTable('locations_employees', table => {
        table.increments('id').primary();
        table.integer('location_id')
            .notNullable()
            .references('id')
            .inTable('locations');
        table.integer('employees_id')
            .notNullable()
            .references('id')
            .inTable('employees');
    });
}

export async function down(knex: Knex) {
    return knex.schema.dropTable('locations_items');
}