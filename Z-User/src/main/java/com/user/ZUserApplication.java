package com.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableFeignClients
public class ZUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZUserApplication.class, args);
	}

	
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	

	
}
