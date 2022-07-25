package com.cognizant.pensionmanagementportal.controller;

import java.util.List;

import com.cognizant.pensionmanagementportal.exception.ResourceNotFoundException;
import com.cognizant.pensionmanagementportal.model.*;
import com.cognizant.pensionmanagementportal.restClient.AuthorizationClient;
import com.cognizant.pensionmanagementportal.restClient.PensionValidationClient;
import com.cognizant.pensionmanagementportal.restClient.ProcessPensionClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins = "*")
public class PensionController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PensionController.class);

	private AuthorizationClient authorizationClient;

	private ProcessPensionClient processPensionClient;
	@Autowired
	private PensionValidationClient pensionValidationClient;



	@Autowired
	public PensionController(AuthorizationClient authorizationClient, ProcessPensionClient processPensionClient) {
		this.authorizationClient = authorizationClient;
		this.processPensionClient = processPensionClient;

	}

	
	@GetMapping("/")
	public String display() {
		return "Pension management working";
	}



	@PostMapping("/token")
	public ResponseEntity<Token> doLogin(@RequestBody AuthRequest authRequest) {
		LOGGER.info("STARTED - doLogin");
		Token token = null;
		try {
			token = authorizationClient.generateToken(authRequest);

		} catch (Exception e) {
			LOGGER.error("EXCEPTION - doLogin");
			throw new ResourceNotFoundException("token can't be generated");
		}

		System.out.println(token);
		LOGGER.debug(token.getToken());

		LOGGER.info("END - doLogin");
		return new ResponseEntity(token,HttpStatus.OK);
	}


	@GetMapping("/details")
	public List<PensionerDetail> allDetail() {
		LOGGER.info("STARTED - allDetail");
		List<PensionerDetail> pensionerDetail = null;
		try {
			pensionerDetail = processPensionClient.allDetail();
		} catch (Exception e) {
			throw new ResourceNotFoundException("pensioner detail list not found");
		}
		LOGGER.info("END - allDetail");
		return pensionerDetail;

	}

	
	@PostMapping("/ProcessPension")
	public ResponseEntity<PensionDetail> getPensionDetail(@RequestHeader(name = "Authorization") String token,
																		  @RequestBody ProcessPensionInput processPensionInput) {
		LOGGER.info("STARTED - getPensionDetail");
		try {
			authorizationClient.authorization(token);
		} catch (Exception e) {
			LOGGER.error("EXCEPTION - getPensionDetail");
			throw new ResourceNotFoundException("enter a valid token");
		}

		LOGGER.info("END - getPensionDetail");
		return processPensionClient.getPensionDetail(token, processPensionInput);

	}
	@PostMapping("/pensionStatus")
	public PensionerStatusResponse validatePensioner(@RequestHeader("Authorization") String token,@RequestBody PensionerInput pensionerInput) {
		PensionerStatusResponse pensionerStatusResponse = null;
		try {
			LOGGER.info("validatePensioner has  started");
			authorizationClient.authorization(token);
		}catch(Exception e) {
			LOGGER.error("An error occured");
			throw new ResourceNotFoundException("token in invalid");
		}
		pensionerStatusResponse = pensionValidationClient.validatePensioner(token, pensionerInput);
		return pensionerStatusResponse;
		
	}
	



}
