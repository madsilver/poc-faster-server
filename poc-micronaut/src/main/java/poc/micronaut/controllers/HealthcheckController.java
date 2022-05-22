package poc.micronaut.controllers;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import poc.micronaut.entities.Healthcheck;

@Controller("/healthcheck")
public class HealthcheckController {

    @Get(processes = MediaType.APPLICATION_JSON)
    public Healthcheck get() {
        return new Healthcheck("It works!");
    }
}
