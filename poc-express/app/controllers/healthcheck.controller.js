class HealthcheckController {
    async get(req, res) {
        const message = { message: 'It works' };
        return res.status(200).json(message);
    }
}

module.exports = HealthcheckController;