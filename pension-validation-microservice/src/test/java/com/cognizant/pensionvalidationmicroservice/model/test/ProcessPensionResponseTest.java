package com.cognizant.pensionvalidationmicroservice.model.test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.pensionvalidationmicroservice.model.PensionerStatusResponse;





@SpringBootTest
public class ProcessPensionResponseTest {

	@Test
	void beanCreationTest() {
		assertNotNull(new PensionerStatusResponse());
	}

	@Test
	void noArgsConstructorTest() {
		PensionerStatusResponse processPensionResponse = new PensionerStatusResponse();
		assertThat(assertThat(processPensionResponse).isNotNull());
	}

	@Test
	void allArgsConstructorTest() {
		PensionerStatusResponse processPensionResponse = new PensionerStatusResponse(20);
		assertThat(assertThat(processPensionResponse).isNotNull());
	}
	
	@Test
	void setterForPensionStatusCodeTest()
	{
		PensionerStatusResponse processPensionResponse = new PensionerStatusResponse();
		processPensionResponse.setStatusCode(20);
		assertNotNull(processPensionResponse);
		
	}
	
	@Test
	void getterForPensionStatusCodeTest() {
		PensionerStatusResponse processPensionResponse = new PensionerStatusResponse(20);
		 int code = processPensionResponse.getStatusCode();
		 assertEquals(20, code) ; 
	}

}
