const express = require('express');
const app = express();
const router = require('./app/router/router')

app.use('/', router)

const port = 8080;

app.listen(port, () => {
    console.log(`server running on port ${port}`);
});