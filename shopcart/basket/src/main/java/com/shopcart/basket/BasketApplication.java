package com.shopcart.basket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication

@PropertySource(value = { "classpath:cassandra.properties" })
@EnableCassandraRepositories(basePackages = "com.shopcart.basket.repository")
public class BasketApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasketApplication.class, args);
    }

}
