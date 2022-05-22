const express = require('express');
const router = express.Router();
const HealthcheckController = require('../controllers/healthcheck.controller');

const healthcheckController = new HealthcheckController();

router.get('/healthcheck', (req, res) => healthcheckController.get(req, res));

module.exports = router;