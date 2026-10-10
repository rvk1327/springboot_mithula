package edu.spcls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/home")
	public String welcomeMessage() {
		return "Welcome to Spring Boot";
	}
	
	@PostMapping("/home")
	public String postMessage() {
		return "This is post method from backend spring boot";
	}
}


