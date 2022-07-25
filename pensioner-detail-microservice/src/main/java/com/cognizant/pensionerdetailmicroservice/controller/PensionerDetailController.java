package com.cognizant.pensionerdetailmicroservice.controller;

import com.cognizant.pensionerdetailmicroservice.entity.PensionerDetail;

import com.cognizant.pensionerdetailmicroservice.exception.ResourceNotFoundException;
import com.cognizant.pensionerdetailmicroservice.repository.PensionerDetailRepository;
import com.cognizant.pensionerdetailmicroservice.restClient.AuthorizationClient;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PensionerDetailController{
	private static  final Logger LOGGER = LoggerFactory.getLogger(PensionerDetailController.class);
	
	@Autowired
    private AuthorizationClient authorizationClient;
	@Autowired
    private PensionerDetailRepository pensionerDetailRepository;
	
	@GetMapping("/")
	public String pensionerDetail() {
		return "pensioner detail working v6";
	}
   
    @GetMapping("/PensionerDetailByAadhaar/{aadhaarNumber}")
    public PensionerDetail getPensionerDetail(@RequestHeader("Authorization") String token, @PathVariable String aadhaarNumber) throws Exception {
        try{
        	authorizationClient.authorization(token);
        	
        	


        }catch(Exception e){
        	LOGGER.error("ERROR! token is invalid");
            throw new ResourceNotFoundException("token is not valid");
        }
     PensionerDetail pensionerDetail = pensionerDetailRepository.findById(aadhaarNumber)
                .orElseThrow(() -> new ResourceNotFoundException("employee with aadhaar number not found"));
   	 LOGGER.info("getPensionerDetail has ended");
   	 return pensionerDetail;
       
        
        







    }
    @GetMapping("/details")
    public List<PensionerDetail> allDetails(){
    	LOGGER.info("allDetails has started");
    	LOGGER.info("allDetails has ended");
        return pensionerDetailRepository.findAll();
    }
}
