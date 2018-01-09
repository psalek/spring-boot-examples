package io.pivotal.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomHealthIndicatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomHealthIndicatorApplication.class, args);
	}
}
