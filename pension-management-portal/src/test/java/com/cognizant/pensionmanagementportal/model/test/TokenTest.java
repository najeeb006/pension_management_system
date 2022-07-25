package com.cognizant.pensionmanagementportal.model.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import com.cognizant.pensionmanagementportal.model.Token;



@SpringBootTest
public class TokenTest {


	@Test
	void noArgsConstructorTest() {
		Token token = new Token();
		assertThat(assertThat(token).isNotNull());
	}

	@Test
	void allArgsConstructorTest() {
		Token token = new Token("maJSDASHDIUEWQHFRBJBWDJjwejqoiejio");
		assertThat(assertThat(token).isNotNull());
	}
	
	@Test
	void setterForTokenTest()
	{
		Token token = new Token();
		token.setToken("whriuwehriuewhruhewuruewhrew");
		assertNotNull(token);
		
	}
	
	@Test
	void getterForTokenTest() {
		Token token = new Token("whejgwhjrjwbrhjbwejhrbuqwhbrhw");
		 String token1 = token.getToken();
		 assertEquals("whejgwhjrjwbrhjbwejhrbuqwhbrhw", token1) ; 
	}

}
