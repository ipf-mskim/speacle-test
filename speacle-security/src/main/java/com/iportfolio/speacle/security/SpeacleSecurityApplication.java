package com.iportfolio.speacle.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpeacleSecurityApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpeacleSecurityApplication.class)
                .properties("spring.config.name:" + "application");
        SpringApplication.run(SpeacleSecurityApplication.class, args);
    }

}
