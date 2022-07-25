package com.cognizant.pensionerdetailmicroservice.restClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;





@FeignClient(name = "authorizationService", url = "${feign.url}")
public interface AuthorizationClient {
	
    @GetMapping("/authorize")
    public boolean authorization(@RequestHeader("Authorization") String token1) ;
}
