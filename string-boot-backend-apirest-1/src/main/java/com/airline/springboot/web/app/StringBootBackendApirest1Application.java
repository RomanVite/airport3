package com.airline.springboot.web.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.airline.springboot.web.app.models.entity"})
@EnableJpaRepositories(basePackages = "com.airline.springboot.web.app.repository")
public class StringBootBackendApirest1Application {

	public static void main(String[] args) {
		SpringApplication.run(StringBootBackendApirest1Application.class, args);
	}

}
