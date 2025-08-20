package com.example.gemini13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Gemini13Application {

    public static void main(String[] args) {
        SpringApplication.run(Gemini13Application.class, args);
    }
}

//after running that, you can access the H2 database console at:
// http://localhost:8080/h2-console

// Make sure to have the H2 database dependency in your project to use the console.
// To access the H2 console, you can navigate to:
// http://localhost:8080/h2-console
// Ensure that you have the correct JDBC URL, username, and password configured in your application properties.
// The default JDBC URL for H2 is usually "jdbc:h2:mem:testdb"
// and the default username is "sa" with no password.
// You can customize these settings in your application.properties file.
// This application can be extended with additional features such as REST controllers, services, and repositories.
// You can also integrate it with other components like security, caching, and more.
// For more information on Spring Boot, refer to the official documentation:
// https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/
// This application is a good starting point for building microservices or web applications using Spring Boot.
