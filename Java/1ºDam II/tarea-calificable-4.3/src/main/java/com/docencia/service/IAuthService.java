package com.docencia.service;

import com.docencia.model.Usuario;

public interface IAuthService {

  Usuario register(int id, String nombre, String email, String password);

  boolean login(String email, String password);

  boolean isBloqueado(String email);

  void desbloquear(String email);
}
