package com.cognizant.processpensionmicroservice.restClient;

import com.cognizant.processpensionmicroservice.model.PensionerDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;



@FeignClient(name="PensionDetailServiceImpl",url = "${feign.url2}")
public interface ProcessPensionRestClient {
    @GetMapping("/PensionerDetailByAadhaar/{aadhaarNumber}")
    public PensionerDetail getPensionerDetail(@RequestHeader("Authorization") String token, @PathVariable String aadhaarNumber);
    @GetMapping("/details")
    public List<PensionerDetail> allDetails();

}
