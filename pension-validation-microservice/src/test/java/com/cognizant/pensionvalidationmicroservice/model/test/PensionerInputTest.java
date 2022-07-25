package com.cognizant.pensionvalidationmicroservice.model.test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.pensionvalidationmicroservice.model.BankDetail;
import com.cognizant.pensionvalidationmicroservice.model.PensionerDetail;
import com.cognizant.pensionvalidationmicroservice.model.PensionerInput;





@SpringBootTest
public class PensionerInputTest {
	
	
	
	@Test
	void checkBeanCreation() {
		assertNotNull(new PensionerInput()) ;
	}
	
	@Test
	void noArgsConstructorTest() {
		PensionerInput pensionerInput1 = new PensionerInput() ;
		assertNotNull(pensionerInput1) ;
	}
	
	@Test
	void allArgsConstructorTest() {
		PensionerInput pensionerInput1 = new PensionerInput("123456789012", 27000.0,500.0) ;
		assertNotNull(pensionerInput1) ;
	}	
	
	@Test
	void getterTest() {
		PensionerInput pensionerInput1 = new PensionerInput() ;
		
		pensionerInput1.setAadhaarNumber("123456789012");
		pensionerInput1.setPensionAmount(27000.0);
		pensionerInput1.setServiceCharge(500.0);;
		
		
		assertNotNull(pensionerInput1) ;
	}
	
	@Test
	void allGettersTest() {
		PensionerInput pensionerInput1 = new PensionerInput("123456789012", 27000.0,500.0) ;
		 
		assertEquals("123456789012", pensionerInput1.getAadhaarNumber()) ; 
		assertEquals(27000.0, pensionerInput1.getPensionAmount()) ; 
		assertEquals(500.0, pensionerInput1.getServiceCharge()) ; 
	}	

}








