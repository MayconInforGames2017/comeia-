const { request, response } = require('express');
const express = require('express');

const router = express.Router();

router.get('/', (request, response) => {
    return response.json('Olá, mundo!')
});

module.exports = router;
