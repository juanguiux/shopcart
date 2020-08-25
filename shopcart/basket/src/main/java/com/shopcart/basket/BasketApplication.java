package com.shopcart.basket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BasketApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasketApplication.class, args);
    }

}
