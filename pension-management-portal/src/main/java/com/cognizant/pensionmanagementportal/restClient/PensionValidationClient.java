package com.cognizant.pensionmanagementportal.restClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cognizant.pensionmanagementportal.model.PensionerInput;
import com.cognizant.pensionmanagementportal.model.PensionerStatusResponse;



@FeignClient(name="validationService",url="${feign.url2}")
public interface PensionValidationClient {
	@PostMapping("/pensionStatus")
	public PensionerStatusResponse validatePensioner(@RequestHeader("Authorization") String token,@RequestBody PensionerInput pensionerInput);

}
