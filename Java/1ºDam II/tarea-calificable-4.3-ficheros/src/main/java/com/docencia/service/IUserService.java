package com.docencia.service;

import java.util.Set;

import com.docencia.model.Usuario;

public interface IUserService {

  Usuario crearUsuario(int id, String nombre, String email, String password);

  Set<Usuario> listarUsuarios();

  /**
   * Funcion que retorna un usuario a traves de su email
   * @param email String con el email del usuario
   * @return Objeto de clase usuario
   */
  Usuario buscarPorEmail(String email);

  /**
   * Funcion que elimina un usuario por email
   * @param email String con el email del usuario
   * @return true / false
   */
  boolean eliminarPorEmail(String email);

  Usuario cambiarNombre(String email, String nuevoNombre);

  Usuario cambiarPassword(String email, String nuevaPassword);
}
