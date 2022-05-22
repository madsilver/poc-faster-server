package pt.sapo.pocspringwebflux.Routers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import pt.sapo.pocspringwebflux.handlers.HealthcheckHandler;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

@Configuration(proxyBeanMethods = false)
public class HealthcheckRouter {
    @Bean
    public RouterFunction<ServerResponse> router(HealthcheckHandler handler) {
        return RouterFunctions
                .route(GET("/healthcheck"), handler::healthcheck);
    }
}
