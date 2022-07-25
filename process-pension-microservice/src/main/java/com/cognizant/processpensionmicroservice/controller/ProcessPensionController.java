package com.cognizant.processpensionmicroservice.controller;

import com.cognizant.processpensionmicroservice.entity.PensionDetail;
import com.cognizant.processpensionmicroservice.exception.ProcessPensionException;
import com.cognizant.processpensionmicroservice.model.PensionerDetail;
import com.cognizant.processpensionmicroservice.model.PensionerInput;
import com.cognizant.processpensionmicroservice.model.PensionerStatusResponse;
import com.cognizant.processpensionmicroservice.model.ProcessPensionInput;

import com.cognizant.processpensionmicroservice.restClient.PensionerValidationClient;
import com.cognizant.processpensionmicroservice.restClient.ProcessPensionRestClient;
import com.cognizant.processpensionmicroservice.service.ProcessPensionService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProcessPensionController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProcessPensionController.class);
    private ProcessPensionRestClient processPensionRestClient;
    private ProcessPensionService processPensionService;
    private PensionerValidationClient pensionerValidationClient;
    @Autowired
    public ProcessPensionController(ProcessPensionRestClient processPensionRestClient,
                                    ProcessPensionService processPensionService,
                                    PensionerValidationClient pensionerValidationClient){
        this.processPensionRestClient = processPensionRestClient;
        this.processPensionService = processPensionService;
      
        this.pensionerValidationClient = pensionerValidationClient;
    }
    @GetMapping("/")
    public String processPension() {
    	return "process pension working";
    }
    @GetMapping("/details")
    public List<PensionerDetail> allDetail(){
    	LOGGER.info("allDetail has started");
    	LOGGER.info("allDetail has ended");
        return processPensionRestClient.allDetails();
    }

    @PostMapping("/ProcessPension")
    public ResponseEntity<PensionDetail> getPensionDetail(@RequestHeader("Authorization") String token, @RequestBody ProcessPensionInput processPensionInput) throws Exception {
        PensionDetail pensionDetail =null;
        try{
            
        	pensionDetail = processPensionService.calculate(processPensionRestClient.getPensionerDetail(token,processPensionInput.getAadhaarNumber()));

        }catch(Exception e){
        	LOGGER.error("pensioner detail in correct");
            throw new ProcessPensionException("Pensioner detail not correct");
        }    
        	
        return new ResponseEntity<>(pensionDetail, HttpStatus.OK);

    }
    @PostMapping("/pensionStatus")
    public PensionerStatusResponse getPensionerStatus(@RequestHeader("Authorization") String token,
    		@RequestBody PensionerInput pensionerInput) {
    	LOGGER.info("getPensionerStatus has started");
    	LOGGER.info("getPensionerStatus has ended");
    	return pensionerValidationClient.validatePensioner(token, pensionerInput);
    	
    	
    }
   
    
}
