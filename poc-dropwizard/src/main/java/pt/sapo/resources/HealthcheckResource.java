package pt.sapo.resources;

import com.codahale.metrics.annotation.Timed;
import pt.sapo.api.Healthcheck;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/healthcheck")
@Produces(MediaType.APPLICATION_JSON)
public class HealthcheckResource {

    @GET
    @Timed
    public Healthcheck get() {
        return new Healthcheck("It works!");
    }
}
