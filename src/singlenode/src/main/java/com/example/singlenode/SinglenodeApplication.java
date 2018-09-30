package com.example.singlenode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SinglenodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SinglenodeApplication.class, args);
	}
}
