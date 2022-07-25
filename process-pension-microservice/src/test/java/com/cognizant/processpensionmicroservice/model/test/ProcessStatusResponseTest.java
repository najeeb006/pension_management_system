package com.cognizant.processpensionmicroservice.model.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.processpensionmicroservice.model.PensionerStatusResponse;

@SpringBootTest
public class ProcessStatusResponseTest {
	@Test
	public void NoArgsTest() {
		assertNotNull(new PensionerStatusResponse());
	}
	@Test
	public void AllArgsTest() {
		assertNotNull(new PensionerStatusResponse(10));
	}
	@Test
	public void SetterTest() {
		PensionerStatusResponse response = new PensionerStatusResponse();
		response.setStatusCode(10);
		assertNotNull(response);
		
	}
	@Test
	public void GetterTest() {
		PensionerStatusResponse response = new PensionerStatusResponse(10);
		assertEquals(10,response.getStatusCode());
	}

}
