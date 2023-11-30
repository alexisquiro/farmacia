package com.farma.demoFarma.infraestructure.user;

import com.farma.demoFarma.domain.user.models.User;
import com.farma.demoFarma.domain.user.ports.outputs.UserRepository;

public abstract class UserRepositoryPostgres implements UserRepository{

	@Override
	public User getUserByName(String nombreUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean authUser(String usuario, String contraseña) {
		// TODO Auto-generated method stub
		return false;
	}

}
