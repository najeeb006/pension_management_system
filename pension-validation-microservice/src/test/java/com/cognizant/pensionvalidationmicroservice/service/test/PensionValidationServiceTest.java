package com.cognizant.pensionvalidationmicroservice.service.test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.pensionvalidationmicroservice.model.BankDetail;
import com.cognizant.pensionvalidationmicroservice.model.PensionerDetail;
import com.cognizant.pensionvalidationmicroservice.model.PensionerInput;
import com.cognizant.pensionvalidationmicroservice.model.PensionerStatusResponse;
import com.cognizant.pensionvalidationmicroservice.service.PensionValidationService;




@SpringBootTest


public class PensionValidationServiceTest {
   

	@InjectMocks
	private PensionValidationService pensionValidationService;

	@Test
	public void contextLoads() {
		assertNotNull(pensionValidationService);
	}

	@Test
	public void checkPrivateBankTestSuccess() throws Exception {
		assertEquals(true, pensionValidationService.inputBankCharge("private", 550.0));

	}
	@Test
	public void checkPublicBankTestSuccess() throws Exception {
		assertEquals(true, pensionValidationService.inputBankCharge("public", 500.0));

	}
	@Test
	public void checkPrivateBankTestFailure() throws Exception {
		assertNotEquals(true, pensionValidationService.inputBankCharge("private", 500.0));
	}	
	@Test
	public void checkPublicBankTestFailure() throws Exception {
		assertNotEquals(true, pensionValidationService.inputBankCharge("public", 550.0));
	}
	@Test
	public void calculatePensionTest() {
		PensionerDetail pensionDetail=new PensionerDetail("19183857573", "Najeeb","06-11-1999" , "PIYTH7890L",40000,12000, "family", new BankDetail("SBI", "1930232384", "public"));
		
		assertNotEquals(true,pensionValidationService.calculatePension(pensionDetail, 27000));
	}
	
	

}
