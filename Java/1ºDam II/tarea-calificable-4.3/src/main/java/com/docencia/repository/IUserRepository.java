package com.docencia.repository;

import java.util.Set;

import com.docencia.model.Usuario;

public interface IUserRepository {

  void save(Usuario usuario);

  Usuario findByEmail(String email);

  public boolean existsByEmail(String email);

  Set<Usuario> findAll();

  boolean deleteByEmail(String email);
}
