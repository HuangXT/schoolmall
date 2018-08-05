package com.schoolmall.xc.micro.server.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudEurekaTwoApplication.class, args);
	}
}
