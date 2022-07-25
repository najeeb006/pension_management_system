package com.cognizant.pensionmanagementportal.controller.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;


import com.cognizant.pensionmanagementportal.controller.PensionController;



@SpringBootTest
@AutoConfigureMockMvc
public class PensionManagementPortalControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	
	
	@Test
	public void displayTest() throws Exception {
		

		ResultActions actions = mockMvc
				.perform(get("/"));
		actions.andExpect(status().isOk());
	}
	
	
	
	
		
	
	
	

}
