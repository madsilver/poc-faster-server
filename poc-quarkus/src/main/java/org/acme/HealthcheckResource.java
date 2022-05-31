package org.acme;

import org.acme.entity.Healthcheck;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/healthcheck")
public class HealthcheckResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Healthcheck healthcheck() {
        return new Healthcheck("It works");
    }
}