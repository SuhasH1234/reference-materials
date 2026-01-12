package com.example.springBootWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
//	@ResponseBody	
	public String greet() {
		return "Welcome Suhas...";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "In about page";
	}
}
  