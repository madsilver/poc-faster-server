package pt.sapo.poc_activex;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;

public class MainVerticle extends AbstractVerticle {
    @Override
    public void start(Promise<Void> startPromise) throws Exception {
        Router router = Router.router(vertx);

        router.get("/healthcheck")
            .respond(ctx -> Future.succeededFuture(new JsonObject().put("message", "It works")));

        vertx.createHttpServer()
            .requestHandler(router)
            .listen(8080)
            .onSuccess(srv ->
                System.out.println("HTTP server started on port " + srv.actualPort())
            );

    }
}
