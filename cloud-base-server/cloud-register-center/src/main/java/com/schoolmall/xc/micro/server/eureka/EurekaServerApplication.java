package com.schoolmall.xc.micro.server.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Lucky
 * @Description: 主要SpringCloud组件-服务注册中心eurekaServer
 * @Date: Created in 12:45 2018/8/5
 * @Modified By:
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}

