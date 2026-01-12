package com.example.mySpringApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary	
public class Destop implements Computer{
	public void compile() {
		System.out.println("In Destop");
	}
}
