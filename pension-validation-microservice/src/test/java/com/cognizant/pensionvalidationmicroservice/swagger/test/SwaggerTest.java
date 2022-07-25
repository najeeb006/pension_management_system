package com.cognizant.pensionvalidationmicroservice.swagger.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.pensionvalidationmicroservice.config.SwaggerConfig;


@SpringBootTest
public class SwaggerTest {
	@Mock
	private SwaggerConfig swaggerConfig;
	@Test
	public void contextLoads() {
		assertNotNull(swaggerConfig);
	}
	

}
