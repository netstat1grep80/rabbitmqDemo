package com.laoz.jpa;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.laoz")
@NacosPropertySource(dataId = "jpa.yaml", autoRefreshed = true, groupId = "DEFAULT_GROUP")
public class RunJpaApplication {
	public static void main(String[] args) {
		SpringApplication.run(RunJpaApplication.class, args);
	}
}
