package com.cognizant.pensionmanagementportal.restClient;

import com.cognizant.pensionmanagementportal.model.AuthRequest;
import com.cognizant.pensionmanagementportal.model.Token;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;



@FeignClient(name = "authorizationService",url = "${feign.url1}")
public interface AuthorizationClient {
	
	@PostMapping("/authenticate")
	public Token generateToken(@RequestBody AuthRequest authRequest) throws Exception;

	@GetMapping("/authorize")
	public Boolean authorization(@RequestHeader("Authorization") String token);

}
