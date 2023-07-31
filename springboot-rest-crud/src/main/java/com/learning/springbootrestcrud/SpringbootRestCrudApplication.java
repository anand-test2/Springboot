package com.learning.springbootrestcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.learning.springbootrestcrud.controller", "com.learning.springbootrestcrud.service", "com.learning.springbootrestcrud.serviceimpl"})
public class SpringbootRestCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestCrudApplication.class, args);
	}

}
