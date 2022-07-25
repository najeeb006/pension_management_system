package com.cognizant.pensionvalidationmicroservice.controller.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;


import com.cognizant.pensionvalidationmicroservice.controller.ValidationController;
import com.cognizant.pensionvalidationmicroservice.exception.PensionValidationException;
import com.cognizant.pensionvalidationmicroservice.model.PensionerInput;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class ValidationControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ValidationController validationController;

	@Test
	public void contextLoadsTestSuccess() {
		assertNotNull(validationController);
	}
	
	@Test
	public void pensionMethodFailureTest() throws Exception {

		
		ResultActions actions = mockMvc.perform(get("/pensionStatus"));
		actions.andExpect(status().isMethodNotAllowed());

	}
	

	

	
	@Test
	public void TestSuccess() throws Exception {

		
		ResultActions actions = mockMvc.perform(get("/"));
		actions.andExpect(status().isOk());

	}

	

	public static String asJsonString(PensionerInput pensionerInput) {
		try {
			return new ObjectMapper().writeValueAsString(pensionerInput);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
