package com.cognizant.pensionmanagementportal.model.test;



import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.pensionmanagementportal.model.PensionDetail;



@SpringBootTest
public class PensionDetailTest {


	@Test
	void NoArgsPensionDetailTest()
	{
		assertThat(new PensionDetail()).isNotNull();
	}
	
	@Test
	void AllArgsPensionDetailTest()
	{
		PensionDetail pensionDetail=new PensionDetail(1,"Najeeb","06-11-1999" , "PIYTH7890L", "family", 52131.0,500.0);
		assertThat(assertThat(pensionDetail).isNotNull());
	}
	
	@Test
	void AllSetterPensionDetailTest()
	{
		PensionDetail pensionDetail=new PensionDetail() ;
		pensionDetail.setName("Nairobi");
		pensionDetail.setDateOfBirth("11-5-1990");
		pensionDetail.setPanNumber("ILUPWS2341C");
		pensionDetail.setPensionType("family");	
		pensionDetail.setPensionAmount(40000);
		pensionDetail.setBankServiceCharge(500);
		assertThat(assertThat(pensionDetail).isNotNull());
	}
	
	@Test
	void AllGetterPensionDetailTest()
	{
		PensionDetail pensionDetail=new PensionDetail(1,"Najeeb","06-11-1999" , "PIYTH7890L", "family", 52131.0,500.0);
		String name = pensionDetail.getName() ;
		String dob = pensionDetail.getDateOfBirth() ;
		String pn = pensionDetail.getPanNumber() ;
		String pt = pensionDetail.getPensionType();
		Double pa = pensionDetail.getPensionAmount() ;
		Double sc = pensionDetail.getBankServiceCharge();
		assertEquals("Najeeb", name) ;
		assertEquals("06-11-1999", dob) ;
		assertEquals("PIYTH7890L", pn) ;
		assertEquals("family", pt) ;
		assertEquals(52131.0, pa) ;
		assertEquals(500.0,sc);
	}
	
	
}
