package com.cognizant.pensionvalidationmicroservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdviceClass {
	@ExceptionHandler
	public ErrorResponse handler(PensionValidationException e) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setMessage(e.getMessage());
		errorResponse.setStatusCode(HttpStatus.NOT_FOUND.value());
		errorResponse.setExceptionTime(System.currentTimeMillis());
		return errorResponse;
		
	}

}
