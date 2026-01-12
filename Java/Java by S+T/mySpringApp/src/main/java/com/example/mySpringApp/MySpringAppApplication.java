package com.example.mySpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MySpringAppApplication {

	public static void main(String[] args) {
				
		ApplicationContext context= SpringApplication.run(MySpringAppApplication.class, args);
		
		Dev obj= context.getBean(Dev.class);
		obj.build();
	}

}
