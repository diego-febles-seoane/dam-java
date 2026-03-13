package com.docencia.service;


import com.docencia.model.Usuario;

public interface IAuthService {
  /**
   * Funcion que permite registrar un usuario dentro del sistema
   * @param id Id del usuario 
   * @param nombre nombre del usuario
   * @param email email del usuario
   * @param password password  del usuario
   * @return
   */
  Usuario register(int id, String nombre, String email, String password);

  boolean login(String email, String password);

  boolean isBloqueado(String email);

  void desbloquear(String email);
}
