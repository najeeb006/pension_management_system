package com.cognizant.processpensionmicroservice.exception.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.processpensionmicroservice.exception.ProcessPensionException;




@SpringBootTest
public class ProcessPensionExceptionTest {
	
	@Test
	public void exceptionTest() {
		ProcessPensionException exception = new ProcessPensionException("exception_message");
		assertNotNull(exception);
	}

}