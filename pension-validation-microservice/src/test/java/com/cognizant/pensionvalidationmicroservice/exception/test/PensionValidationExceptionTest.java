package com.cognizant.pensionvalidationmicroservice.exception.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.pensionvalidationmicroservice.exception.PensionValidationException;



@SpringBootTest
public class PensionValidationExceptionTest {
	
	@Test
	public void exceptionTest() {
		PensionValidationException exception = new PensionValidationException("exception_message");
		assertNotNull(exception);
	}

}