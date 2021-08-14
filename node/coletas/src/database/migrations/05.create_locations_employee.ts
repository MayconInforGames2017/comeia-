import Knex from 'knex';

export async function up(knex: Knex) {
    return knex.schema.createTable('locations_employees', table => {
        table.increments('id').primary();
        table.integer('location_id')
            .notNullable()
            .references('id')
            .inTable('locations');
        table.integer('employee_id')
            .notNullable()
            .references('id')
            .inTable('employees');
    });
}

export async function name(knex: Knex) {
    return knex.schema.dropTable('locations_employees');
}