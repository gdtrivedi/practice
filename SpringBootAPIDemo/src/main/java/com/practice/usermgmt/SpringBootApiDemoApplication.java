package com.practice.usermgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.practice.usermgmt")
public class SpringBootApiDemoApplication {

	public static void main(String[] args) {
		System.out.println("***** In SpringBootApiDemoApplication main method *****");
		SpringApplication.run(SpringBootApiDemoApplication.class, args);
	}
}
