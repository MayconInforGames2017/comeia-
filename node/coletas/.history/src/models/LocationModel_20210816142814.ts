import knex from "../database/connection";
import IItems from "../interfaces/items";
import ILocation from "../interfaces/locations";
export default class LocationModel {
    public async getAll() {
        const locations = await knex('locations').select();

        return locations;
    }

    public async create(location: ILocation, items: IItems) {
        const transaction = await knex.transaction();

        const locationExists = await knex('locations').select().first();

        if (locationExists) {
            return { message: "Location já cadastrada"};
        }

        await transaction.commit();
    }

}