import Knex from 'knex';

export async function up(knex: Knex) {
    return knex.schema.createTable('employess', table => {
        table.increments('id').primary();
        table.string('matricula').notNullable();
        table.string('image').notNullable();
    });
}

export async function down(knex: Knex) {
    return knex.schema.dropTable('employees');
}