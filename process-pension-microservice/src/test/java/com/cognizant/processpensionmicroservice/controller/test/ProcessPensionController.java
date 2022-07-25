package com.cognizant.processpensionmicroservice.controller.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.cognizant.processpensionmicroservice.model.PensionerInput;
import com.cognizant.processpensionmicroservice.model.ProcessPensionInput;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class ProcessPensionController {
	private static String token="eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJOYWplZWIiLCJleHAiOjE2NTg4Mjg5NzAsImlhdCI6MTY1ODcyMDk3MH0.5j3TB0Cwz3DS7vJJ3gKZeijtO6VRjpXWDZ1rMP4RnPo";
	@Autowired
	private MockMvc mockMvc;
	@Mock
	private ProcessPensionController controller;
	
	
	@Test
	public void contextLoads() {
		assertNotNull(controller);
	}
	@Test
	public void ProcessPensionSuccessTest() throws Exception {
		ProcessPensionInput processPensionInput = new ProcessPensionInput("123456789012");
		ResultActions actions = mockMvc.perform(post("/ProcessPension").contentType(MediaType.APPLICATION_JSON).content(asJsonString(processPensionInput)).header("Authorization","Bearer "+token));
		actions.andExpect(status().isOk());
	}
	@Test
	public void ProcessPensionFailureTest() throws Exception {
		ProcessPensionInput processPensionInput = new ProcessPensionInput("123456789012");
		ResultActions actions = mockMvc.perform(post("/ProcessPension").contentType(MediaType.APPLICATION_JSON).content(asJsonString(processPensionInput)));
		actions.andExpect(status().isBadRequest());
	}
	@Test
	public void PensionStatusSuccessTest() throws Exception {
		PensionerInput pensionerInput = new PensionerInput("123456789013",27000,500);
		ResultActions actions = mockMvc.perform(post("/pensionStatus").contentType(MediaType.APPLICATION_JSON).content(asJsonString1(pensionerInput)).header("Authorization","Bearer "+token));
		actions.andExpect(status().isOk());
	}
	
	@Test
	public void ProcessPensionFailureTest1() throws Exception {
		
		ResultActions actions = mockMvc.perform(get("/ProcessPension"));
		actions.andExpect(status().isMethodNotAllowed());
	}
	@Test
	public void SuccessTest1() throws Exception {
		
		ResultActions actions = mockMvc.perform(get("/"));
		actions.andExpect(status().isOk());
	}
	@Test
	public void FailureTest1() throws Exception {
		
		ResultActions actions = mockMvc.perform(post("/"));
		actions.andExpect(status().isMethodNotAllowed());
	}
	@Test
	public void SuccessTest2() throws Exception {
		
		ResultActions actions = mockMvc.perform(get("/details"));
		actions.andExpect(status().isOk());
	}
	@Test
	public void FailureTest2() throws Exception {
		
		ResultActions actions = mockMvc.perform(post("/details"));
		actions.andExpect(status().isMethodNotAllowed());
	}
	@Test
	public void PensionStatusFailureTest() throws Exception {
	
		ResultActions actions = mockMvc.perform(get("/ProcessPension"));
		actions.andExpect(status().isMethodNotAllowed());
	}

	public static String asJsonString(ProcessPensionInput input) {
		try {
			return new ObjectMapper().writeValueAsString(input);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
			
		
	}
	public static String asJsonString1(PensionerInput input) {
		try {
			return new ObjectMapper().writeValueAsString(input);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
			
		
	}
	

}
