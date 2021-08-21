import knex from "../database/connection";
import IItems from "../interfaces/items";
import ILocation from "../interfaces/locations";
export default class LocationModel {
    public async getAll() {
        const locations = await knex('locations').select();

        return locations;
    }

    public async create(location: ILocation, items: IItems[]) {
        const transaction = await knex.transaction();

        const locationExists = await 
            knex('locations')
                .select({name: location.name})
                .first();

        if (locationExists) {
            transaction.rollback();
            return { message: "Location já cadastrada"};
        }

        const [id] = await transaction('locations').insert('location');

        let error = 0;

        const locantionItens = items.map(async (item_id: any) => {
            const validateItem = await transaction("items")
            .where({ id: item_id })
            .first();

            if (!validateItem) {
                error += 1;
                return;
            }
            else {
                return {
                    item_id: validateItem.id;
                    location_id: id    
                }
            }
        });

        if((await Promise.all(locantionItens)) && error > 0) {
            return { message: "Location já cadastrada" }
        } 

        await transaction.commit();
    }

}