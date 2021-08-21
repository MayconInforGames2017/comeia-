import 'reflect-metadata';
import express, { Request, response, Response } from 'express';
import 'express-async-errors';
import cors from 'cors';
import routes from '@shared/http/routes';
import '@shared/typeorm';
import AppError from '@shared/errors/AppError';

const app = express();

app.use(cors());

app.use(express.json());

// routes
app.use(routes);

app.use((error: Error, request: Request, response: Response) => {
    if (error instanceof AppError) {
        return response.status(error.statusCode).json({
            message: error.message,
            status: 'error'
        });
    }

    return response.status(500).json({
        message: error.message,
        status: 'error'
    });
});

app.listen(3333, () => {
    console.log('Server on port 3333');
});