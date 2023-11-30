package com.farma.demoFarma.aplication.user.controller;

import java.awt.event.ActionEvent;

import com.farma.demoFarma.aplication.user.service.AuthService;
import com.farma.demoFarma.domain.user.models.User;
import com.farma.demoFarma.domain.user.services.Auth.AuthenticationService;

import javafx.scene.control.Button;


public class UserController {
	private AuthenticationService authService;
	
	
	
	public UserController (AuthenticationService userService) {
			this.authService=userService;
		
	}
	
	
	public boolean authUser(String name,String password) {
	        // Lógica que se ejecutará cuando se haga clic en el botón
	      User user= new User();
	      user.setName(name);
	      user.setPassword(password);
	       return authService.autenticarUsuario(user);
	    }
	    
	    private void getUser(String user) {
	        // Lógica que se ejecutará cuando se haga clic en el botón
	        System.out.println("¡Se hizo clic en el botón!");
	    }
}
