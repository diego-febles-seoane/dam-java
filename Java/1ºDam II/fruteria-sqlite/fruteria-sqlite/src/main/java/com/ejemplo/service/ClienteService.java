package com.ejemplo.service;

import java.util.List;

import com.ejemplo.model.Cliente;
import com.ejemplo.repository.IClienteRepository;
import com.ejemplo.repository.sqlite.ClienteSqliteRepository;
import com.ejemplo.validation.ValidationUtils;

public class ClienteService implements IClienteService {

    private final IClienteRepository repository;

    public ClienteService() {
        this.repository = new ClienteSqliteRepository();
    }

    @Override
    public boolean create(Cliente cliente) {
        if (!validar(cliente)) {
            System.err.println("El cliente no es valido");
            return false;
        }
        return repository.create(cliente);
    }

    @Override
    public Cliente findByDni(String dni) {
        if (dni == null || dni.isEmpty()) {
            System.err.println("El dni no es valido");
            return null;
        }
        return repository.findByDni(dni);
    }

    @Override
    public List<Cliente> findAll() {
        return repository.findAll();
    }

    @Override
    public boolean update(Cliente cliente) {
        if (!validar(cliente)) {
            System.err.println("El cliente no es valido");
            return false;
        }
        return repository.update(cliente);
    }

    @Override
    public boolean deleteByDni(String dni) {
        if (dni == null || dni.isEmpty()) {
            System.err.println("El dni no es valido");
            return false;
        }
        return repository.deleteByDni(dni);
    }

    @Override
    public List<Cliente> findActivos() {
        return repository.findActivos();
    }

    @Override
    public List<Cliente> findByCiudad(String ciudad) {
        if (ciudad == null || ciudad.isEmpty()) {
            System.err.println("La ciudad no es valida");
            return null;
        }
        return repository.findByCiudad(ciudad);
    }

    @Override
    public Cliente findByEmail(String email) {
        if (email == null || email.isEmpty()) {
            System.err.println("El email no es valido");
            return null;
        }
        return repository.findByEmail(email);
    }

    private boolean validar(Cliente cliente) {
        return ValidationUtils.isValidCliente(cliente);
    }
}
