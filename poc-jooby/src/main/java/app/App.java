package app;

import app.controller.HealthcheckController;
import io.jooby.Jooby;

public class App extends Jooby {
    {
        mvc(new HealthcheckController());
    }
    public static void main(String[] args) {
        runApp(args, App::new);
    }

}
