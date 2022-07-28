package com.laoz.rd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.laoz")
public class RunRdApplication {
	public static void main(String[] args) {
		SpringApplication.run(RunRdApplication.class, args);
	}
}
