import { request } from 'http';
import { Request, Response } from "express";
import ListProductService from "../services/ListProductService";

export default class ProductsController {

    public async index(request: Request, response: Response): Promise<Response> {
        const service = new ListProductService();
        const products = await service.execute();
        return response.json(products);
    }

    public async create(request: Request, response: Response): Promise<Response> {
        const { name, price, quantity } = request.body;
        const service = new ListProductService();
        const products = await service.execute();
        return response.json(products);
    }

}