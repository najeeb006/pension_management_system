package com.cognizant.util.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.util.JwtUtil;

@SpringBootTest
public class UtilTest {
	@Autowired
	private JwtUtil jwtUtil;
	@Test
	public void test() {
		assertNotNull(jwtUtil);
		
		
	}

}
