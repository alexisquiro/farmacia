package com.farma.demoFarma.aplication.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.farma.demoFarma.aplication.views.home.HomeView;
import com.farma.demoFarma.aplication.views.login.*;

import javafx.application.Application;

@SpringBootApplication

@EntityScan("com.farma.demoFarma")
public class DemoFarmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFarmaApplication.class, args);
		
		
		
		 Application.launch(Login.class, args);
	
		 
	}
	
}
