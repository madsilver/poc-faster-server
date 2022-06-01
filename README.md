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
The tests were performed using the benchmarking tools above:
- [WRK](https://github.com/wg/wrk)
- [Apache Benchmark](https://httpd.apache.org/docs/2.4/programs/ab.html)
- [Locust](https://github.com/locustio/locust)

#### WRK - 100 Requests, 100 Thread :fire:

| Framework     | Request/sec   | Transfer/sec  |
|   :-          |       :-:     |       :-:     |
| activej       | 190935.59     | 21.26MB       |
| dropwizard    | 71040.23      | 10.43MB       |
| jooby         | 299537.47     | 38.28MB       |
| micronaut     | 178704.01     | 26.25MB       |
| quarkus       | 259520.96     | 26.48MB       |
| spring mvc    | 94840.14      | 13.31MB       |
| spring webflux| 165601.39     | 14.69MB       |
| thorntail     | 117448.17     | 17.25MB       |
| vert.x        | 139222.75     | 12.35MB       |
| echo          | 250430.22     | 35.11MB       |
| express       | 11694.85      | 2.87MB        |

#### WRK - 1M Requests, 1 Thread :rocket:

| Framework     | Request/sec   | Transfer/sec  |
|   :-          |       :-:     |       :-:     |
| activej       | 168910.86     | 21.26MB       |
| dropwizard    | 17771.23      | 2.61MB        |
| jooby         | 119640.7      | 15.40MB       |
| micronaut     | 86104.02      | 12.73MB       |
| quarkus       | 99268.10      | 10.13MB       |
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
