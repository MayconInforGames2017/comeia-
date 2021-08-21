import { getCustomRepository } from "typeorm";
import ProductsRepository from "../typeorm/repositories/ProductsRepository";
import Product from "../typeorm/entities/Product";
import { IProduct } from "../interfaces/Product";

export default class CreateProductService {
    public async execute(): Promise<Product[]> {
        const productsRepository = getCustomRepository(ProductsRepository);
        const products = await productsRepository.find();
        return products;
    }
}