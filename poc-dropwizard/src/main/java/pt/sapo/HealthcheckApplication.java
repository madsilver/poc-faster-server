package pt.sapo;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import pt.sapo.resources.HealthcheckResource;

public class HealthcheckApplication extends Application<HealthcheckConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HealthcheckApplication().run(args);
    }

    @Override
    public String getName() {
        return "healthcheck";
    }

    @Override
    public void initialize(final Bootstrap<HealthcheckConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final HealthcheckConfiguration configuration,
                    final Environment environment) {
        final HealthcheckResource resource = new HealthcheckResource();
        environment.jersey().register(resource);
    }

}
