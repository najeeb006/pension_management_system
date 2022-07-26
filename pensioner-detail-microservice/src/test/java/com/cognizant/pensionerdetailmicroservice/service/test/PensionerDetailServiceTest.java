package com.cognizant.pensionerdetailmicroservice.service.test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;


import com.cognizant.pensionerdetailmicroservice.entity.BankDetail;
import com.cognizant.pensionerdetailmicroservice.entity.PensionerDetail;
import com.cognizant.pensionerdetailmicroservice.repository.PensionerDetailRepository;
import com.cognizant.pensionerdetailmicroservice.service.PensionerDetailServiceImpl;



@SpringBootTest(classes = PensionerDetailServiceTest.class)
@AutoConfigureMockMvc
public class PensionerDetailServiceTest {
	
	@Mock
	private PensionerDetailRepository repository;

	@InjectMocks
	private PensionerDetailServiceImpl pds;
	
	@Test
	public void contextLoads() {
		assertNotNull(repository);
	}

	@Test
	public void testNotNullPensionDetailServiceObject() {
		assertNotNull(pds);
	}

	@Test
	public void testPensionerDetailFunction() {
		
	
		BankDetail bankDetail = new BankDetail("SBI", "1234567743", "public");
		PensionerDetail pensionerDetail = new PensionerDetail("1234567890", "Pratyush", "06-11-1999", "PASW33334DW",
				30000.0, 12000.0, "family", bankDetail);
		assertNotNull(bankDetail);
		assertNotNull(pensionerDetail);
		repository.save(pensionerDetail);
	    assertNotNull(repository.findById("1234567890"));
	    assertNotNull(repository.findAll());

		

	    
	}



}