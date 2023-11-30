package com.farma.demoFarma.domain.user.services.Auth;

import com.farma.demoFarma.domain.user.models.User;

public interface AuthenticationService {

   public boolean autenticarUsuario(User user);
}