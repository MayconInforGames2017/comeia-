const calculadora = require('./calculadora');

const express = require('express');

const server = express();

const array = [1, 2, 3, 4];

const somar = (valorAnterior, valorAtual) =>  valorAnterior + valorAtual;

console.log(array.reduce(somar));

server.listen(3333, () => {
    //console.log("Server on line on port 3333!")
});