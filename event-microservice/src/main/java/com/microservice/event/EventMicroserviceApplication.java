package com.microservice.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EventMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventMicroserviceApplication.class, args);
	}

}
