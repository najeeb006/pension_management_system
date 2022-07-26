package com.cognizant.processpensionmicroservice.service.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.processpensionmicroservice.entity.PensionDetail;
import com.cognizant.processpensionmicroservice.model.BankDetail;
import com.cognizant.processpensionmicroservice.model.PensionerDetail;
import com.cognizant.processpensionmicroservice.repository.ProcessPensionRepository;
import com.cognizant.processpensionmicroservice.service.ProcessPensionServiceImpl;


@SpringBootTest
public class ProcessPensionerServiceImplTest {
	@Mock
	private ProcessPensionRepository processPensionRepository;

	@InjectMocks
	private ProcessPensionServiceImpl service;
	
	@Test
	public void contextLoads() {
		assertNotNull(service);
	}
	
	

	@Test
	public void loadUserByUserNameShouldUserNameTest() {
		PensionerDetail pensionerDetails1 = new PensionerDetail("12904284925403", "hamis", "06-11-1999", "PQWER12345", 40000.00,
                12000.00, "family", new BankDetail("SBI","123456789","public"));
		assertNotEquals(service.calculate(pensionerDetails1),new PensionDetail(1, "hamis", "06-11-1999", "PQWER12345", "family", 30000.00,500));
		
		assertThat(service.findPensionDetail()).isNotNull();
		assertEquals(processPensionRepository.findAll(),service.findPensionDetail());
		
		
	}
	


}
