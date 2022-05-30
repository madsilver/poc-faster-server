package pt.sapo.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Healthcheck {

    private String message;

    public Healthcheck() {
    }

    public Healthcheck(String message) {
        this.message = message;
    }

    @JsonProperty
    public String getMessage() {
        return message;
    }
}
