package com.cognizant.pensionvalidationmicroservice.service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cognizant.pensionvalidationmicroservice.model.PensionerDetail;
import com.cognizant.pensionvalidationmicroservice.model.PensionerInput;
import com.cognizant.pensionvalidationmicroservice.model.PensionerStatusResponse;



@Service
public class PensionValidationService {

	private static final Logger LOGGER = LoggerFactory.getLogger(PensionValidationService.class);

	private int successCode = 10;
	private int failedCode = 20;

	
	public PensionerStatusResponse statusCode(PensionerDetail pensionerDetail, PensionerInput processPensionInput) {

		LOGGER.info("STARTED - statusCode "+pensionerDetail.getAadhaarNumber());
		String bankType = pensionerDetail.getBankDetail().getBankType();
		double bankServiceCharge = processPensionInput.getServiceCharge();

		if (inputBankCharge(bankType, bankServiceCharge)
				&& calculatePension(pensionerDetail, processPensionInput.getPensionAmount())) {
			LOGGER.info("END - statusCode - success "+successCode);
			return new PensionerStatusResponse(successCode);
		}else {
			LOGGER.info("END - statusCode - fail");
			return new PensionerStatusResponse(failedCode);
			
		}

		
	}

	
	
	public boolean calculatePension(PensionerDetail pensionerDetail, double pensionInput) {
		LOGGER.info("STARTED - calculatePension");
		double pensionAmount = 0;
		if (pensionerDetail.getPensionType().equalsIgnoreCase("self")) {
			pensionAmount = 0.8 * pensionerDetail.getSalary() + pensionerDetail.getAllowance();
		} else if (pensionerDetail.getPensionType().equalsIgnoreCase("family")) {
			pensionAmount = 0.5 * pensionerDetail.getSalary() + pensionerDetail.getAllowance();
		}
		LOGGER.info("END - calculatePension "+ (pensionAmount == pensionInput)+" "+pensionAmount+ " "+pensionInput);
		return pensionAmount == pensionInput;
	}

	
	
	public boolean inputBankCharge(String bankType, double bankCharge) {

		LOGGER.info("STARTED - inputBankCharge");
		if (bankType.equalsIgnoreCase("private")) {
			if (bankCharge == 550) {
				LOGGER.info("END - inputBankCharge - private - true");
				return true;
			}else {
				LOGGER.info("END - inputBanckCharge - private - false");
				return false;
			}
		}
		if (bankType.equalsIgnoreCase("public")) {
			if (bankCharge == 500) {
				LOGGER.info("END - inputBankCharge - public - true");
				return true;
			}else {
				LOGGER.info("END - inputBankCharge - public - false");
				return false;
			}
		}
		LOGGER.info("END - inputBankCharge - false");
		return false;
	}

}
