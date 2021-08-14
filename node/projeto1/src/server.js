const express = require('express');
const router = require('./routers');

const server = express();

server.use(router);

server.listen(3335, () => {
    console.log('Server on');
});