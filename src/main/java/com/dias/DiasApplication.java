package com.dias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = "com.dias")
@EntityScan(basePackages = "com.dias")
@EnableJpaRepositories(basePackages = "com.dias")
public class DiasApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiasApplication.class, args);
    }

}
