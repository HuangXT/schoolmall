package com.schoolmall.xc.micro.server.base.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Lucky
 * @Description:
 * @Date: Created in 12:45 2018/8/5
 * @Modified By:
 */

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@EnableAdminServer
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
public class AdminMonitorCenterServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminMonitorCenterServerApplication.class,args);
    }
}