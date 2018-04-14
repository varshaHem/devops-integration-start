package com.devops.integration.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main (String[] args){
        System.out.println("Jenkins Test!");
        SpringApplication.run(Application.class, args);
    }
}
