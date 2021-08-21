import { getCustomRepository } from 'typeorm';
import ProductsRepository from '../typeorm/repositories/ProductsRepository';
import Product from '../typeorm/entities/Product';
import { IProduct } from '../interfaces/Product'; 
import AppError from '@shared/errors/AppError';

export default class CreateProductService {
    public async execute({ name, price, quantity }: IProduct): Promise<Product> {
        const productsRepository = getCustomRepository(ProductsRepository);

        const productExits = await productsRepository.findByName(name);
    }     
}