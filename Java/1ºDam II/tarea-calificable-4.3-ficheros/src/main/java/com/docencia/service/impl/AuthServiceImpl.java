package com.docencia.service.impl;

import com.docencia.model.Usuario;
import com.docencia.repository.IUserRepository;
import com.docencia.repository.impl.UserRepositoryImpl;
import com.docencia.service.IAuthService;
import com.docencia.service.IUserService;
import com.docencia.util.Validaciones;

public class AuthServiceImpl implements IAuthService{

    final IUserRepository userRepository;

    public AuthServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Usuario register(int id, String nombre, String email, String password) {
        if (id < 1 ||
            !Validaciones.emailValido(email) ||
             !Validaciones.passwordValida(password)) {
                return null;
             }
        email = Validaciones.normalizarEmail(email);
        Validaciones.validarPassword(password); 
        
        Usuario usuario = new Usuario(id, nombre, email, password);
        userRepository.save(usuario);     
        return usuario;
    }

    @Override
    public boolean login(String email, String password) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

    @Override
    public boolean isBloqueado(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isBloqueado'");
    }

    @Override
    public void desbloquear(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'desbloquear'");
    }

}
