package app.controller;

import io.jooby.annotations.GET;
import io.jooby.annotations.Path;

@Path("/healthcheck")
public class HealthcheckController {

    @GET
    public String get() {
        return "{\"message\":\"It works\"}";
    }
}
