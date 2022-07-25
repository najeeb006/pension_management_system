package com.cognizant.pensionmanagementportal.exception.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.pensionmanagementportal.exception.ResourceNotFoundException;


@SpringBootTest
public class ResourceNotFoundExceptionTest {
	
	@Test
	public void exceptionTest() {
		ResourceNotFoundException exception = new ResourceNotFoundException("exception_message");
		assertNotNull(exception);
	}

}
