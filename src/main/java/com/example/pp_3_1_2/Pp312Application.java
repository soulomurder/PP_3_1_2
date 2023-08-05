package com.example.pp_3_1_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class Pp312Application {

    public static void main(String[] args) {
        SpringApplication.run(Pp312Application.class, args);
    }

}
