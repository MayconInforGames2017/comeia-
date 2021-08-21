import { Request, Response } from 'express';
import ItemModel from '../models/ItemModel';

export default class ItemController {

    public async index(request: Request, response: Response) {
        const itemModel = new ItemModel();

        const items: any = await itemModel.getAll();

        const parsedItems = items.map((item: any) => (
            {
                id: item.id,
                name: item.name,
                image: `http://localhost:3333/items/upload/${item.image}`
            }
        ))
        response.json(items);
    }

}