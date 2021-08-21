import knex from "../database/connection";
export default class LocationModel {
    public async getAll() {
        const locations = await knex('locations').select();

        return locations;
    }
}