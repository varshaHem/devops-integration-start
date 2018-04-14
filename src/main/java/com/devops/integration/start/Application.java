package com.devops.integration.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
    public static void main (String[] args){
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping(method = RequestMethod.GET,
                    value = "/hello",
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello() {
        return "Hello World!";
    }

}
