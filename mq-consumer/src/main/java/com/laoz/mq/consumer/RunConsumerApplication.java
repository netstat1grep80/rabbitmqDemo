package com.laoz.mq.consumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.laoz.mq.*")
public class RunConsumerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RunConsumerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{

	}
}
