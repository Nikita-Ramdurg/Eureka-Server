package com.config.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SecurityController {
	
	@GetMapping("/security")
	public String security(String name) {
		return "Hello "+name;
		
	}

}
