import {
    Entity,
    Column,
    PrimaryGeneratedColumn,
    CreateDateColumn,
    UpdateDateColumn
} from 'typeorm';

@Entity('products')
export default class Product {

    id: string;

    name: string;

    price: number;

    quantity: number;

    created_at: Date;

    updated_at: Date;
    
}