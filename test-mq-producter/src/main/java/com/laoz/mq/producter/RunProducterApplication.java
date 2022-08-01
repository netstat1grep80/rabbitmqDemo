package com.laoz.mq.producter;


import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.laoz.mq.*")
@NacosPropertySource(dataId = "mq-config.properties", autoRefreshed = true, groupId = "DEFAULT_GROUP")
public class RunProducterApplication {
	public static void main(String[] args) {
		SpringApplication.run(RunProducterApplication.class, args);
	}
}
