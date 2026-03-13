package com.docencia.service.impl;

import java.util.Set;

import com.docencia.model.Usuario;
import com.docencia.repository.IUserRepository;
import com.docencia.repository.impl.UserRepositoryImpl;
import com.docencia.service.IUserService;
import com.docencia.util.Validaciones;

public class UserServiceImpl implements IUserService{
    private final IUserRepository userRepository;

    public UserServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Usuario crearUsuario(int id, String nombre, String email, String password) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearUsuario'");
    }

    @Override
    public Set<Usuario> listarUsuarios() {
        return userRepository.findAll();
    }

    @Override
    public Usuario buscarPorEmail(String email) {
        if (!Validaciones.emailValido(email)) {
            return null;
        }
        email = Validaciones.normalizarEmail(email); 
        return userRepository.findByEmail(email);
    }

    @Override
    public boolean eliminarPorEmail(String email) {
        if (!Validaciones.emailValido(email)) {
            return false;
        }
        email = Validaciones.normalizarEmail(email);
        return userRepository.deleteByEmail(email);
    }

    @Override
    public Usuario cambiarNombre(String email, String nuevoNombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cambiarNombre'");
    }

    @Override
    public Usuario cambiarPassword(String email, String nuevaPassword) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cambiarPassword'");
    }

}
