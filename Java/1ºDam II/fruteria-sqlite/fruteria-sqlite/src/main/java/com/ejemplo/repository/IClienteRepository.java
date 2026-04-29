package com.ejemplo.repository;

import com.ejemplo.model.Cliente;

public interface IClienteRepository {
    boolean create(Cliente cliente);
    Cliente findByDni(String dni);
    java.util.List<Cliente> findAll();
    boolean update(Cliente cliente);
    boolean deleteByDni(String dni);
    java.util.List<Cliente> findActivos();
    java.util.List<Cliente> findByCiudad(String ciudad);
    Cliente findByEmail(String email);
}
