package com.cognizant.pensionvalidationmicroservice.restClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cognizant.pensionvalidationmicroservice.model.PensionerDetail;

@FeignClient(name="penseionerDetailService",url="${feign.url2}")
public interface PensionerDetailClient {
	@GetMapping("/PensionerDetailByAadhaar/{aadhaarNumber}")
    public PensionerDetail getPensionerDetail(@RequestHeader("Authorization") String token, @PathVariable String aadhaarNumber);

}
