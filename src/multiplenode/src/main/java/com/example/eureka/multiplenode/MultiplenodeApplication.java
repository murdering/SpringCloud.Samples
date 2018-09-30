package com.example.eureka.multiplenode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MultiplenodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiplenodeApplication.class, args);
	}
}
