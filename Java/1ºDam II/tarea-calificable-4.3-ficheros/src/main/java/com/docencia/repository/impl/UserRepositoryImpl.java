package com.docencia.repository.impl;

import java.util.Set;

import com.docencia.model.Usuario;
import com.docencia.repository.IUserRepository;
import com.docencia.repository.file.FileCsv;

public class UserRepositoryImpl extends FileCsv implements IUserRepository{
    final Set<Usuario> usuarios;
    
    public UserRepositoryImpl() {
        super();
        this.usuarios = super.read();
    }

    @Override
    public Usuario findByEmail(String email) {
        if (!existsByEmail(email)) {
            return null;
        }
        Usuario usuarioBuscar = new Usuario(email);
        for (Usuario usuario : usuarios) {
            if (usuario.equals(usuarioBuscar)){
                return usuario;
            }
        }
        return null;
    }

    @Override
    public boolean existsByEmail(String email) {
        //Usuario usuarioBuscar = new Usuario(email);
        //return usuarios.contains(usuarioBuscar);
        return true;
    }

    @Override
    public void save(Usuario usuario) {
        usuarios.add(usuario);
        this.write(usuario.toCsv());
    }

    @Override
    public Set<Usuario> findAll() {
        return usuarios;
    }

    @Override
    public boolean deleteByEmail(String email) {
       if (!existsByEmail(email)) {
        return false;
       }
       return usuarios.remove(new Usuario(email)); 
    }



}
