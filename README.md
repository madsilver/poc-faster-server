# POC Faster Server
This proof of concept aims to determine the fastest and most performative framework, based on a simple Healthcheck implementation.

## Frameworks
- [Activej](https://activej.io/) (Java)
- [Dropwizard](https://www.dropwizard.io/) (Java)
- [Echo](https://echo.labstack.com/) (Golang)
- [Express](https://expressjs.com/) (Nodejs)
- [Jooby](https://jooby.io/) (Java)
- [Micronaut](https://micronaut.io/) (Java)
- [Quarkus](https://quarkus.io/) (Java)
- [Spring MVC](https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html) (Java)
- [Spring Webflux](https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html) (Java)
- [Thorntail](https://thorntail.io/) (Java)
- [Vert.x](https://vertx.io/) (Java)

## Benchmark
The tests were performed using the benchmarking tool [WRK](https://github.com/wg/wrk)

| Framework     | Request/sec   | Transfer/sec  |
|   :-          |       :-:     |       :-:     |
| activej       | 168910.86     | 21.26MB       |
| jooby         | 119640.7      | 15.40MB       |
| micronaut     | 86104.02      | 12.73MB       |
| spring mvc    | 25903.94      | 21.26MB       |
| spring webflux| 68963.34      | 6.12MB        |
| thorntail     | 61307.96      | 9.00MB        |
| vert.x        | 91806.23      | 8.14MB        |
| echo          | 117374.54     | 16.45MB       |
| express       | 18402.85      | 4.11MB        |

## Environment
- Ubuntu 20.04.4 LTS
- 16G RAM
- 11th Gen Intel® Core™ i5-1135G7 @ 2.40GHz × 8 
