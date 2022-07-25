package com.cognizant.controller.test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import com.cognizant.controller.AuthorizationController;
import com.cognizant.model.AuthRequest;
import com.cognizant.model.Token;
import com.cognizant.util.JwtUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc


public class AuthControllerTests {
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private AuthorizationController authorizationController;
	



	@Test
	public void contextLoads() {
		assertNotNull(authorizationController);
	}

	@Test
	public void loginTestSuccess() throws Exception {
		AuthRequest admin = new AuthRequest("Najeeb", "password1");
		assertNotNull(admin);

		ResultActions actions = mockMvc
				.perform(post("/authenticate").contentType(MediaType.APPLICATION_JSON).content(asJsonString(admin)));
		actions.andExpect(status().isOk());
		
	}

	
	@Test
	public void loginTestFail() throws Exception {
		AuthRequest admin = new AuthRequest("WrongUser", "password1");

		ResultActions actions = mockMvc
				.perform(post("/authenticate").contentType(MediaType.APPLICATION_JSON).content(asJsonString(admin)));
		actions.andExpect(status().isNotFound());
		
		
				
	}
	
	
	

	public static String asJsonString(AuthRequest admin) {
		try {
			return new ObjectMapper().writeValueAsString(admin);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	
	

}