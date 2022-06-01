from locust import HttpUser, task

class HealthcheckUser(HttpUser):

    @task
    def healthcheck(self):
        self.client.get("/healthcheck")


