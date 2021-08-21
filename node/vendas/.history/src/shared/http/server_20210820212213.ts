import 'reflect-metadata';
import express, { Request, Response } from 'express';
import '@shared/typeorm';
import AppError from '@shared/errors/AppError';

const app = express();

app.use(express.json());

// routes

app.listen(3333, () => {
    console.log('Server on port 3333');
});