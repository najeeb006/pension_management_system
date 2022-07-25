package com.cognizant.pensionvalidationmicroservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.pensionvalidationmicroservice.exception.PensionValidationException;
import com.cognizant.pensionvalidationmicroservice.model.PensionerInput;
import com.cognizant.pensionvalidationmicroservice.model.PensionerStatusResponse;
import com.cognizant.pensionvalidationmicroservice.restClient.AuthorizationClient;
import com.cognizant.pensionvalidationmicroservice.restClient.PensionerDetailClient;
import com.cognizant.pensionvalidationmicroservice.service.PensionValidationService;



@RestController
public class ValidationController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ValidationController.class);
	@Autowired
	private PensionerDetailClient pensionerDetailClient;
	@Autowired
	private PensionValidationService pensionValidationService;
	@Autowired
	private AuthorizationClient authorizationClient;
	
	@GetMapping("/")
	public String pensionValidation() {
		return "pension validation working";
	}
	
	@PostMapping("/pensionStatus")
	public PensionerStatusResponse validatePensioner(@RequestHeader("Authorization") String token,@RequestBody PensionerInput pensionerInput) {
		PensionerStatusResponse pensionerStatusResponse = null;
		if(authorizationClient.authorization(token)) {
			try {
				LOGGER.info("validatePensioner has started");
				pensionerStatusResponse= pensionValidationService.statusCode(pensionerDetailClient.getPensionerDetail(token, pensionerInput.getAadhaarNumber()),pensionerInput);

			}catch(Exception e) {
				LOGGER.error("Pension amount is wrong");
				
				throw new PensionValidationException("pension amount is incorrect");
				
			}
			
		}
		
		LOGGER.info("validatePensioner has ended");
		return pensionerStatusResponse;
		
		
		
		
	}


}
