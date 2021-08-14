import Knex from 'knex';

export async function seed(knex: Knex) {
    await knex('items').insert([
        { name: 'Papeis', image: '' },
        { name: 'Vidros', image: '' },
    ]);    
}