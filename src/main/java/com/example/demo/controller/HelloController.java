package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HelloWorldService;

@RestController
public class HelloController {

	  HelloWorldService helloWorldService = new HelloWorldService();

	  @GetMapping("/hello")
	  public String greet() {
	    String message = helloWorldService.greet();
	    return message;
	  }
	
}
