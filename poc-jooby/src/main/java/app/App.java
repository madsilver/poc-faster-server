package app;

import io.jooby.AccessLogHandler;
import io.jooby.Jooby;

public class App extends Jooby {
    {
        decorator(new AccessLogHandler());
        get("/healthcheck", ctx -> "{\"message\":\"It works\"}");
    }
    public static void main(String[] args) {
        runApp(args, App::new);
    }
}
