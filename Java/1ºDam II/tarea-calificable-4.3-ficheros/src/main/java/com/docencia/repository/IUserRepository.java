package com.docencia.repository;

import java.util.Optional;
import java.util.Set;

import com.docencia.model.Usuario;

public interface IUserRepository {

    /**
     * Funcion que realiza la busqueda de un email de usuario
     * 
     * @param email String con el email normalizado
     * @return Usuario/Null
     */
    public Usuario findByEmail(String email);

    /**
     * Funcion que determina si existe un email dentro del conjunto de usuarios
     * 
     * @param email String con el email normalizado
     * @return true/false
     */
    public boolean existsByEmail(String email);

    /**
     * Funcion que almacena un usuario en el repositorio
     * @param usuario El objeto usuario relleno
     */
    void save(Usuario usuario);

    /**
     * Funcion que retorna todos los elementos del repositorio
     * @return Set de usuarios
     */
    Set<Usuario> findAll();

    boolean deleteByEmail(String email);

}
