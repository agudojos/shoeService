package com.adidas.shoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class Application {

  /**
   * Main starting point of the microservice.
   *
   * @param args an array of arguments passed to the application
   */
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}