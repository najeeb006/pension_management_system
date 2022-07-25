package com.cognizant.pensionmanagementportal.model.test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.pensionmanagementportal.model.AuthRequest;



@SpringBootTest
public class AuthRequestTest {

	

	@Test
	void noArgsConstructorTest() {
		AuthRequest authRequest = new AuthRequest();
		assertNotNull(authRequest);
	}

	@Test
	void AllArgsConstructorTest() {
		AuthRequest authRequest = new AuthRequest("Najeeb", "password1");
		assertNotNull(authRequest);
	}

	@Test
	void settersTest() {
		AuthRequest authRequest = new AuthRequest();
		authRequest.setPassword("Password2");
		authRequest.setUserName("Hamis");
		assertNotNull(authRequest) ;
	}

	@Test
	void gettersTest() {
		AuthRequest authRequest = new AuthRequest("Najeeb", "password1");
		assertEquals("Najeeb", authRequest.getUserName());
		assertEquals("password1", authRequest.getPassword());
	}

}
