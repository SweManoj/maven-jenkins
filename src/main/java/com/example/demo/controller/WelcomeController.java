package com.example.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class WelcomeController {

	private final String url = "/welcome";

	@GetMapping(value = { url })
	public String getWelcome() {
		return "Welcome to jenkins Application!!!";
	}

}
