package com.cognizant.pensionmanagementportal.model.test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.pensionmanagementportal.model.ProcessPensionInput;



@SpringBootTest
public class ProcessPensionInputTest {

	
	@Test
	void noArgsConstructorTest() {
		ProcessPensionInput ppi = new ProcessPensionInput() ;
		assertNotNull(ppi) ;
	}
	
	@Test 
	void allArgsConstructorTest() {
		ProcessPensionInput ppi = new ProcessPensionInput("123456789012") ;
		assertNotNull(ppi);

	}
	
	@Test
	void settersTest() {
		ProcessPensionInput ppi = new ProcessPensionInput() ;
		ppi.setAadhaarNumber("123456789012");
		
		assertNotNull(ppi) ;

	}
	
	@Test
	void gettersTest() {
		ProcessPensionInput ppi = new ProcessPensionInput("123456789012") ;
		String aadhaar = ppi.getAadhaarNumber() ;
	
		assertEquals("123456789012", aadhaar) ;
	

	}
	
	
	
}
