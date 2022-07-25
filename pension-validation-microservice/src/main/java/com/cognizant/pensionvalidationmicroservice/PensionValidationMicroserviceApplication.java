package com.cognizant.pensionvalidationmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PensionValidationMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PensionValidationMicroserviceApplication.class, args);
	}

}
