package app;

import io.jooby.GracefulShutdown;
import io.jooby.Jooby;
import io.jooby.ServerOptions;

public class App extends Jooby {
    {
        final int port = getEnvironment()
                .getConfig()
                .getInt("port");

        setServerOptions(new ServerOptions().setPort(port));

        install(new GracefulShutdown());

        get("/healthcheck", ctx -> "{\"message\":\"It works\"}");
    }
    public static void main(String[] args) {
        runApp(args, App::new);
    }
}
