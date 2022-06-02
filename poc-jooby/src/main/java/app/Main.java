package app;

import io.jooby.*;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {
        Jooby app = new Jooby();
        app.decorator(new AccessLogHandler());

        app.get("/healthcheck", ctx ->
            CompletableFuture.supplyAsync(() -> "{\"message\":\"It works\"}")
        );

        app.start();
    }
}
