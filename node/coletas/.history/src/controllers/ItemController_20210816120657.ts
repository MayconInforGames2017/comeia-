import { Request, Response } from 'express';
import ItemModel from '../models/ItemModel';

export default class ItemController {

    public async index(request: Request, response: Response) {
        const itemModel = new ItemModel();

        const items: any = await itemModel.getAll();
        response.json(items);
    }

}