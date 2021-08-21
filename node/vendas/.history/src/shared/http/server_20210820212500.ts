import 'reflect-metadata';
import express, { Request, response, Response } from 'express';
import '@shared/typeorm';
import AppError from '@shared/errors/AppError';
import { request } from 'http';

const app = express();

app.use(express.json());

// routes

app.use((error: Error, request: Request, response: Response) => {
    if (error instanceof AppError) {
        return response.status(error.statusCode).json({
            message: error.message,
            status: 'error'
        });
    }
});

app.listen(3333, () => {
    console.log('Server on port 3333');
});