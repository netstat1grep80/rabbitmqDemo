package com.laoz.rd;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.laoz")
@NacosPropertySource(dataId = "rd.yaml", autoRefreshed = true, groupId = "DEFAULT_GROUP")
public class RunRdApplication {
	public static void main(String[] args) {
		SpringApplication.run(RunRdApplication.class, args);
	}
}
