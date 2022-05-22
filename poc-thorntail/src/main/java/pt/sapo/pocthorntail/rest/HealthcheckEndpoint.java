package pt.sapo.pocthorntail.rest;


import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;


@Path("/healthcheck")
@Produces(MediaType.APPLICATION_JSON)
public class HealthcheckEndpoint {
    @GET
    public Response doGet() {
        return Response.ok(new Healthcheck("It works")).build();
    }
}
