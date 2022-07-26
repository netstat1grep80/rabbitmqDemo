package com.laoz.mq.producter;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.laoz.mq.*")
public class RunProducterApplication {
	public static void main(String[] args) {
		SpringApplication.run(RunProducterApplication.class, args);
	}
}
