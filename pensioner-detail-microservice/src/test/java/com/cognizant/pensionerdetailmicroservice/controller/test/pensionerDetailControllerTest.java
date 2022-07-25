package com.cognizant.pensionerdetailmicroservice.controller.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;


import com.cognizant.pensionerdetailmicroservice.controller.PensionerDetailController;



@SpringBootTest
@AutoConfigureMockMvc
public class pensionerDetailControllerTest
 {
	private static String token ="eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJOYWplZWIiLCJleHAiOjE2NTg4MzE4MjUsImlhdCI6MTY1ODcyMzgyNX0.BSrPjBKXf_TpWb9m55cSVoH-6DSahy4ZNope0qVCHDg";


	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private PensionerDetailController pensionerDetailController;
	@Test
	public void contextLoads() {
		assertNotNull(pensionerDetailController);
	}
	
	@Test
	public void allDetailsTestSuccess() throws Exception {
		

		ResultActions actions = mockMvc
				.perform(get("/details"));
		actions.andExpect(status().isOk());
	}
	@Test
	public void TestSuccess() throws Exception {
		

		ResultActions actions = mockMvc
				.perform(get("/"));
		actions.andExpect(status().isOk());
	}
	@Test
	public void pensionerDetailFailure() throws Exception {
		
		ResultActions actions = mockMvc.perform(get("/PensionerDetailByAadhaar").param("aadhaarNumber","12345678901").header("Authorization", "Bearer "+token));
		actions.andExpect(status().is(404));
	
	}
	
	
	
	
	


	
	
	
	

}
