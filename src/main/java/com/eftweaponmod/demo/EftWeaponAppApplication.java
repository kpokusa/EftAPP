package com.eftweaponmod.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@EnableJpaRepositories
public class EftWeaponAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(EftWeaponAppApplication.class, args);
    }

}
