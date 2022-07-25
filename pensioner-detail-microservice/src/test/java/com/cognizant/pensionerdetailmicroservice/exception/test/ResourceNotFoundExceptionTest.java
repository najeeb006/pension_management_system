package com.cognizant.pensionerdetailmicroservice.exception.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.pensionerdetailmicroservice.exception.ResourceNotFoundException;

@SpringBootTest
public class ResourceNotFoundExceptionTest {
	
	@Test
	public void exceptionTest() {
		ResourceNotFoundException exception = new ResourceNotFoundException("exception_message");
		assertNotNull(exception);
	}

}
