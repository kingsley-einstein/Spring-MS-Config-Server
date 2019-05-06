package com.spring.microservice.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringMsServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMsServerConfigApplication.class, args);
	}

}
