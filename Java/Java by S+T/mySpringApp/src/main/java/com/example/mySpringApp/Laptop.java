package com.example.mySpringApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
	public void compile() {
		System.out.println("In Laptop");
	}
}
