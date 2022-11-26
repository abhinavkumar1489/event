package com.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.SpringServletContainerInitializer;

@SpringBootApplication
public class Event1Application extends SpringServletContainerInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Event1Application.class, args);
		System.out.println("get response");
	}

}
