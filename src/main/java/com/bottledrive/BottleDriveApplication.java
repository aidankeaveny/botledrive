package com.bottledrive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.bottledrive.repository")
@EntityScan(basePackages = "com.bottledrive.model")
public class BottleDriveApplication {

    public static void main(String[] args) {
        SpringApplication.run(BottleDriveApplication.class, args);
    }
}
