package com.cognizant.pensionmanagementportal.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
	private String message;
	private int statusCode;
	private Long exceptionTime;

}
