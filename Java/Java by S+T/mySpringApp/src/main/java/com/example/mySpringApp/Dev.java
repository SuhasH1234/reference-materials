package com.example.mySpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Dev{
	
	@Autowired	//field injection
	
//	private Laptop laptop;
	
	@Qualifier("destop")	// or @Primary to choose which should be choosen incase of confusion
	private Computer comp;
	
//	public Dev(Laptop laptop) {	//constructor injection
//		this.laptop= laptop;
//	}
//	
	
//	@Autowired	//setter injection
//	public void setLaptop(Laptop laptop) {
//		this.laptop= laptop;
//	}
	
	public void build() {
		
		comp.compile();
		
		System.out.println("Working on Spring Project");
	}
}
