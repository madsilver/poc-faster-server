package pt.sapo.pocspringwebflux.handlers;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import pt.sapo.pocspringwebflux.entities.Healthcheck;
import reactor.core.publisher.Mono;

@Component
public class HealthcheckHandler {

    public Mono<ServerResponse> healthcheck(ServerRequest request) {
        return ServerResponse.ok()
                .body(BodyInserters.fromValue(new Healthcheck("It works")));
    }
}
