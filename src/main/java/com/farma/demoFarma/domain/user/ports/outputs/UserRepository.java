package com.farma.demoFarma.domain.user.ports.outputs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farma.demoFarma.domain.user.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public User getUserByName(String nombreUsuario);

    public boolean authUser(String usuario, String contraseña);
    

}