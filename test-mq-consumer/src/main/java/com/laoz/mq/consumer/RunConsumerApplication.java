package com.laoz.mq.consumer;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.laoz.mq.*")
@NacosPropertySource(dataId = "mq-config.properties", autoRefreshed = true, groupId = "DEFAULT_GROUP")
public class RunConsumerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RunConsumerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{

	}
}
