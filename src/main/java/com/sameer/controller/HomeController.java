package com.sameer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/api")
	public String home() {
		return "Hi sameer";
		
	}
	@GetMapping("/ajitesh")
	public String ajitesh() {
		return"Hi Ajitesh";
	}


}
