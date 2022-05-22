package pt.sapo.pocspringmvc.models;

public class Healthcheck {
    private String message;

    public Healthcheck(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Healthcheck{" +
                "message='" + message + '\'' +
                '}';
    }
}
