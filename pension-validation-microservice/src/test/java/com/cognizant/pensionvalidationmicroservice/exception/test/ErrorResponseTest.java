package com.cognizant.pensionvalidationmicroservice.exception.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.pensionvalidationmicroservice.exception.ErrorResponse;





@SpringBootTest
public class ErrorResponseTest {
	@Test
	public void NoArgsTest() {
		ErrorResponse error = new ErrorResponse();
		assertNotNull(error);
		
	}
	@Test
	public void AllArgsTest() {
		ErrorResponse error = new ErrorResponse("message",10,System.currentTimeMillis());
		assertNotNull(error);
		
	}
	@Test
	public void SetterArgsTest() {
		ErrorResponse error = new ErrorResponse();
		error.setMessage("message");
		error.setStatusCode(10);
		error.setExceptionTime(System.currentTimeMillis());
		assertNotNull(error);
		
	}
	@Test
	public void GetterArgsTest() {
		ErrorResponse error = new ErrorResponse("message",10,System.currentTimeMillis());
		assertEquals("message",error.getMessage());
		assertEquals(10,error.getStatusCode());
		assertNotEquals(System.currentTimeMillis(),error.getExceptionTime());
		
	}

}