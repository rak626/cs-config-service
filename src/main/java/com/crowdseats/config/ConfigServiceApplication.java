package com.crowdseats.config;

import com.crowdseats.framework.common_util.ProfileSetup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
@ComponentScan(basePackages = "com.crowdseats")
public class ConfigServiceApplication {

	public static void main(String[] args) {
		System.setProperty("service.name", "config");
		ProfileSetup.setupProfile(new SpringApplication(ConfigServiceApplication.class), args);
	}

}
