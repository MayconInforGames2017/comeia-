import Knex from 'knex';

export async function up(knex: Knex) {
    return knex.schema.createTable('employees', table => {
        table.increments('id').primary();
        table.string('name').notNullable();
        table.string('registration').notNullable();
    });
}

export async function name(knex: Knex) {
    return knex.schema.dropTable('employees');
}