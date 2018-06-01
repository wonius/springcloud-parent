package com.woniu.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author woniu
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServersApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServersApplication.class, args);
	}
}
