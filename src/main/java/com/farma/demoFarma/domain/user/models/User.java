package com.farma.demoFarma.domain.user.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name= "client_user")
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Getter
    @Setter
	private String name;
	@Getter
    @Setter
    
	private String password;
	
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
		
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
		
	}
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		this.password=password;
		
	}
	
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
		
	}
	
	
}


    
