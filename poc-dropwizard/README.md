# Healthcheck

### Create from maven archetype
```sh
mvn archetype:generate -DarchetypeGroupId=io.dropwizard.archetypes -DarchetypeArtifactId=java-simple -DarchetypeVersion=2.1.0
```

How to start the Healthcheck application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/poc-dropwizard-1.0-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`
