![alt text](https://cftechsol.com/wp-content/uploads/2017/12/caiofrota-logo-300x171.png)

[![Build](https://img.shields.io/travis/caiofrota/cf-rest.svg)](#)
[![Coverage](https://codecov.io/gh/caiofrota/cf-rest/branch/master/graph/badge.svg)](#)
[![GitHub issues](https://img.shields.io/github/issues/caiofrota/cf-rest.svg)](https://github.com/caiofrota/cf-rest/issues)
[![Fork](https://img.shields.io/github/forks/caiofrota/cf-rest.svg)](#)
[![Stars](https://img.shields.io/github/stars/caiofrota/cf-rest.svg)](#)
[![License](https://img.shields.io/github/license/caiofrota/cf-rest.svg)](#)
[![Total Downloads](https://img.shields.io/github/downloads/caiofrota/cf-rest/total.svg)](https://github.com/caiofrota/cf-rest/releases)
[![Slack Chat](https://img.shields.io/badge/chat-slack-green.svg)](https://cftechsol.slack.com)
[![Website](https://img.shields.io/badge/website-cftechsol.com-green.svg)](https://cftechsol.com)

# CF Rest

An API to assist rest projects.

Version 1.0.0 is still in progress.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See [deployment](#deployment) for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

* [Maven](https://maven.apache.org/) - Dependency Management
* [Project Lombok](https://projectlombok.org/) - Reducing Boilerplate Code

### Installing

Clone this repository

```
git clone https://github.com/caiofrota/cf-rest.git
```

## Deployment

*pom.xml*

* Add the dependency and the repository in your pom.xml

```
  <dependencies>
    <dependency>
      <groupId>com.cftechsol</groupId>
      <artifactId>cf-rest</artifactId>
      <version>1.0.0</version>
    </dependency>
  </dependencies>
  
  <repositories>
    <repository>
      <id>cftechsol.com</id>
      <url>https://maven2.cftechsol.com</url>
    </repository>
  </repositories>
```

*Application.java*

* Add "com.cftechsol" to @ComponentScan

```
@SpringBootApplication
@ComponentScan(basePackages = { "com.yourpackage", "com.cftechsol" })
@EnableJpaRepositories(basePackages = { "com.yourpackage", "com.cftechsol" })
@EntityScan(basePackages = { "com.yourpackage", "com.cftechsol" })
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
```

### Using API

* [Using Authentication](/readme/USING_AUTHENTICATION.md)
* [Using GenericEntity and GenericAuditEntity](/readme/USING_GENERICENTITY_AND_GENERICAUDITENTITY.md)
* [Using GenericService](/readme/USING_GENERICSERVICE.md)
* [Using GenericController](/readme/USING_GENERICCONTROLLER.md)
* [Using GenericController with security](/readme/USING_GENERICCONTROLLER_SECURED.md)
* [Exception Handler](/readme/EXCEPTION_HANDLER.md)

### Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring Boot](https://projects.spring.io/spring-boot/) - Inversion Of Control (IOC) - Boot, Data and Test
* [Spring Security](https://projects.spring.io/spring-security/) - Securing the application
* [JSON Web Token](https://www.jsonwebtoken.io/) - Creating Secure, Signed JWTs
* [Project Lombok](https://projectlombok.org/) - Reducing Boilerplate Code
* [MySQL](https://www.mysql.com/) - MySQL Database
* [Flyway](https://flywaydb.org/) - Database migrations
* [H2 Database](http://www.h2database.com) - Java SQL Database - To run the tests
* [GSON](https://github.com/google/gson) - Google JSON library for Java
* [Travis CI](https://travis-ci.org/) - Continuos Integration
* [JaCoCo](http://www.eclemma.org/jacoco/) - Code Coverage Library for Java
* [Codecov](https://codecov.io/) - Code coverage reports repository
* [Maven Wagon FTP](http://maven.apache.org/wagon/wagon-providers/wagon-ftp/) - Apache FTP Plugin

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/caiofrota/6e65a17fd3bf100d058cb48dcc780b21) for details on our code of conduct, and the process for submitting pull requests to us.

## Authors

* **Caio Frota** - *Initial work* - [caiofrota](https://github.com/caiofrota)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
