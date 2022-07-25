package com.cognizant.pensionvalidationmicroservice.model.test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.pensionvalidationmicroservice.model.BankDetail;





@SpringBootTest
class BankDetailTest {
	
	@Test
	void NoArgsBankTest()
	{
		assertThat(new BankDetail()).isNotNull();
	}
	
	@Test
	void AllArgsBankTest()
	{
		BankDetail bankDetail = new BankDetail("SBI", "123456789", "public");
		assertThat(bankDetail).isNotNull();
	}
	
	@Test
	void SetterBankTest()
	{
		BankDetail bankDetail = new BankDetail();
		bankDetail.setAccountNumber("123456789");
		bankDetail.setBankName("SBI");
		bankDetail.setBankType("public");
		assertThat(bankDetail).isNotNull();
	}
	
	@Test
	void getBankDetailTest()
	{
		BankDetail bankDetail = new BankDetail("SBI", "123456789", "public");
		String bankAccountNumber = bankDetail.getAccountNumber() ;
		String bankName = bankDetail.getBankName() ;
		String bankType = bankDetail.getBankType() ;
		assertEquals("123456789", bankAccountNumber) ;
		assertEquals("SBI", bankName) ;
		assertEquals("public", bankType) ;
	}
	

}
