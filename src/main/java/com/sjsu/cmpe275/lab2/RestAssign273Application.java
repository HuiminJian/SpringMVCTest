package com.sjsu.cmpe275.lab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class RestAssign273Application extends SpringBootServletInitializer {
										//generate war
	public static void main(String[] args) {

		SpringApplication.run(RestAssign273Application.class, args);
	}

	//generate war
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RestAssign273Application.class);
	}
}
