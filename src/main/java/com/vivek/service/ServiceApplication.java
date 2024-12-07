package com.vivek.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
		"com.vivek.service.repository",
		"com.vivek.service.rest",
		"com.vivek.service.domain",
		"com.vivek.service.services.impl",
"com.vivek.service.consumers"})

public class ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

}
