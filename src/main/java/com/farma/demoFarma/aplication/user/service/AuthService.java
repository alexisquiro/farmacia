package com.farma.demoFarma.aplication.user.service;

import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farma.demoFarma.domain.user.models.User;
import com.farma.demoFarma.domain.user.ports.outputs.UserRepository;
import com.farma.demoFarma.domain.user.services.Auth.AuthenticationService;
import com.farma.demoFarma.infraestructure.user.UserRepositoryPostgres;



@Service
public class AuthService implements AuthenticationService{
	
	@Autowired
	private UserRepository repository;
	
	
	@Override
	public boolean autenticarUsuario(User user) {	
		//repository.findAll();
		return false;
		}
	}
