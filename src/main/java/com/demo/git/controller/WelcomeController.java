package com.demo.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcomeMessage() {
		return "Welcome to Spring Boot !";
	}
	
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/sailesh-hub/GitDemoWelcomeApplication.git
//	git push -u origin main


}
