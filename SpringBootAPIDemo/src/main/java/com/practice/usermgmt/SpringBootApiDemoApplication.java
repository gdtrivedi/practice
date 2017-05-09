package com.practice.usermgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.practice.usermgmt")
public class SpringBootApiDemoApplication {

	// Spring Boot Main Method
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApiDemoApplication.class, args);
	}
}
