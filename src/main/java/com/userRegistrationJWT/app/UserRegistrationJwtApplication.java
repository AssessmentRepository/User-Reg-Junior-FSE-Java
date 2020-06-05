package com.userRegistrationJWT.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication(scanBasePackages = { "com.userRegistrationJWT" })
@EnableAutoConfiguration
@EnableMongoRepositories(basePackages = "com.userRegistrationJWT.*")
public class UserRegistrationJwtApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationJwtApplication.class, args);
	}
}
