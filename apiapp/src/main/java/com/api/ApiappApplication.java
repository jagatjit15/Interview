package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ApiappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiappApplication.class, args);
	}

}
