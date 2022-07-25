package com.cognizant.processpensionmicroservice.model.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.processpensionmicroservice.model.PensionerInput;

@SpringBootTest
public class PensionerInputTest {
	@Test
    public void NoArgsTest() {
		assertNotNull(new PensionerInput());
	}
	@Test
	public void AllArgsTest() {
		assertNotNull(new PensionerInput("123456789012",27000,500));
	}
	@Test
	public void GetterTest() {
		PensionerInput pensionerInput = new PensionerInput("123456789012",27000,500);
		assertEquals("123456789012",pensionerInput.getAadhaarNumber());
		assertEquals(27000,pensionerInput.getPensionAmount());
		assertEquals(500,pensionerInput.getServiceCharge());
	}
	@Test
	public void SetterTest() {
		PensionerInput pensionerInput = new PensionerInput();
		pensionerInput.setAadhaarNumber("123456789012");
		pensionerInput.setPensionAmount(27000);
		pensionerInput.setServiceCharge(500);
		assertNotNull(pensionerInput);
	}

}
