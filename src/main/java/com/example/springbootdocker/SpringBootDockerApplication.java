package com.example.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootDockerApplication {
  public String home(){
      return "Welcome to Azkaban";
  }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerApplication.class, args);
    }

}
        