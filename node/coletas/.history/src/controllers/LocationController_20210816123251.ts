import { Request, Response } from 'express';
import LocationModel from '../models/LocationModel';
export default class LocationController {

    public async index(request: Request, response: Response) {
        
        response.json([]);
    }

}