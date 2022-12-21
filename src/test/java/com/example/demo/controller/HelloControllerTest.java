package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.example.demo.service.HelloWorldService;

class HelloControllerTest {

	HelloController helloController=new HelloController();
	

	
	@Test
	public void greetShouldReturnAValidOutput() {
		
		String result = helloController.greet();
		assertEquals("Hello, World!",result);
		System.out.println("Greet give successful output");
	}

}
