package pt.sapo.pocspringmvc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.sapo.pocspringmvc.models.Healthcheck;

@RestController
@RequestMapping("/healthcheck")
public class HealthcheckController {
    @GetMapping
    public Healthcheck get() {
        return new Healthcheck("It works");
    }
}
