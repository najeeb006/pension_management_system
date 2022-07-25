package com.cognizant.pensionmanagementportal.restClient;

import java.util.List;

import com.cognizant.pensionmanagementportal.model.PensionDetail;
import com.cognizant.pensionmanagementportal.model.PensionerDetail;
import com.cognizant.pensionmanagementportal.model.ProcessPensionInput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;



@FeignClient(name = "ProcessPensionService", url="${feign.url3}")
public interface ProcessPensionClient {
	
	@PostMapping("/ProcessPension")
	public ResponseEntity<PensionDetail> getPensionDetail(@RequestHeader(name = "Authorization") String token, @RequestBody ProcessPensionInput processPensionInput);

	@GetMapping("/details")
	public List<PensionerDetail> allDetail();
}
