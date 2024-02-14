package com.buy.now;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroServiceCustomer {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceCustomer.class, args);
	}

}
