import 'reflect-metadata';
import express from 'express';
import '@shared/typeorm';
import AppError from '@shared/errors/AppError';

const app = express();

app.use(express.json());

app.listen(3333, () => {
    console.log('Server on port 3333');
});