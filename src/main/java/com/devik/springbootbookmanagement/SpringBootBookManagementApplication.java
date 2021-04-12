package com.devik.springbootbookmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringBootBookManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBookManagementApplication.class, args);
        System.out.println("Server has started...");

    }

    @Bean
    public BookInjector addBook() {
        return new BookInjector();
    }

}
