package com.arqsoftware.productscache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ProductsCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductsCacheApplication.class, args);
    }

}
