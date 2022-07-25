package com.cognizant.pensionmanagementportal.model.test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.pensionmanagementportal.model.PensionerInput;



@SpringBootTest
public class PensionerInputTest {
	
	
	
	
	@Test
	void noArgsConstructorTest() {
		PensionerInput pensionerInput1 = new PensionerInput() ;
		assertNotNull(pensionerInput1) ;
	}
	
	@Test
	void allArgsConstructorTest() {
		PensionerInput pensionerInput1 = new PensionerInput("123456789012", 27000, 550) ;
		assertNotNull(pensionerInput1) ;
	}	
	
	@Test
	void getterTest() {
		PensionerInput pensionerInput1 = new PensionerInput();
		pensionerInput1.setAadhaarNumber("123456789012");
		pensionerInput1.setPensionAmount(27000);
		pensionerInput1.setServiceCharge(550);
		
		assertNotNull(pensionerInput1) ;
	}
	
	@Test
	void allGettersTest() {
		PensionerInput pensionerInput1 = new PensionerInput("123456789012", 27000, 550) ;
		 
		assertEquals("123456789012", pensionerInput1.getAadhaarNumber()) ; 
		assertEquals(27000, pensionerInput1.getPensionAmount());
		assertEquals(550,pensionerInput1.getServiceCharge());
	}	

}








