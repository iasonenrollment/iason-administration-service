package com.iason.administration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class IasonAdministrationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IasonAdministrationServiceApplication.class, args);
    }

}
