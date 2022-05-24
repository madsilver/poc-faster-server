package pt.sapo;

import io.activej.http.AsyncServlet;
import io.activej.http.HttpMethod;
import io.activej.http.HttpResponse;
import io.activej.http.RoutingServlet;
import io.activej.inject.annotation.Provides;
import io.activej.launcher.Launcher;
import io.activej.launchers.http.HttpServerLauncher;
import pt.sapo.entities.Healthcheck;

public class Application extends HttpServerLauncher {

    @Provides
    AsyncServlet servlet() {
        return RoutingServlet.create()
                .map(HttpMethod.GET, "/healthcheck", request ->
                        HttpResponse.ok200().withJson(new Healthcheck("It works").toString()));
    }

    public static void main(String[] args) throws Exception {
        Launcher launcher = new Application();
        launcher.launch(args);
    }
}
