package com.docencia.service;

import java.util.Set;

import com.docencia.model.Usuario;

public interface IUserService {

  Usuario crearUsuario(int id, String nombre, String email, String password);

  Set<Usuario> listarUsuarios();

  Usuario buscarPorEmail(String email);

  boolean eliminarPorEmail(String email);

  Usuario cambiarNombre(String email, String nuevoNombre);

  Usuario cambiarPassword(String email, String nuevaPassword);
}
