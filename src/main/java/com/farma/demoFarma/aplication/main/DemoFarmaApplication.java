package com.farma.demoFarma.aplication.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.farma.demoFarma.aplication.views.login.*;

import javafx.application.Application;

@SpringBootApplication
public class DemoFarmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFarmaApplication.class, args);
		
		
		
		 Application.launch(Login.class, args);
	
		 
	}
	
}
