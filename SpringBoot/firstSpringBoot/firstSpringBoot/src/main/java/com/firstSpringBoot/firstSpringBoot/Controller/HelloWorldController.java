package com.firstSpringBoot.firstSpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
//	GET HTTP Method
	@GetMapping("/")
	public String message() {
		return "Welcome";
	}
	
	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "Hello World";
	}
}
