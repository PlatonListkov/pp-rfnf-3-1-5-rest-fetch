package ru.kata.spring.boot_security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSecurityDemoApplication {

//	private InitialDataLoader initialDataLoader;
//
//	public SpringBootSecurityDemoApplication(InitialDataLoader initialDataLoader) {
//		this.initialDataLoader = initialDataLoader;
//	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityDemoApplication.class, args);
	}
}
