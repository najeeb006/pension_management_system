package com.cognizant.processpensionmicroservice.restClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cognizant.processpensionmicroservice.model.PensionerInput;
import com.cognizant.processpensionmicroservice.model.PensionerStatusResponse;

@FeignClient(name="pensionerValidationService",url="${feign.url3}")
public interface PensionerValidationClient {
	@GetMapping("/pensionStatus")
	public PensionerStatusResponse validatePensioner(@RequestHeader("Authorization") String token,PensionerInput pensionerInput);
	

}
