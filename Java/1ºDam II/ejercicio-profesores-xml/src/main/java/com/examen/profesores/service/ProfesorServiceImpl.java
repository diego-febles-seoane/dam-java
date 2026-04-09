package com.examen.profesores.service;

import com.examen.profesores.model.Profesor;
import com.examen.profesores.repository.ProfesorRepository;

import java.util.List;

public class ProfesorServiceImpl implements ProfesorService {

    private final ProfesorRepository repository;

    public ProfesorServiceImpl(ProfesorRepository repository) {
        this.repository = repository;
    }

    @Override
    public Profesor registrarProfesor(String id, String nombre, String departamento) {
        if (isBlank(id) || isBlank(nombre) || isBlank(departamento) || repository.existsById(id.trim())) {
            return null;
        }
        Profesor profesor = new Profesor(id.trim(), nombre.trim(), departamento.trim());
        return repository.save(profesor) ? profesor : null;
    }

    @Override
    public Profesor buscarProfesor(String id) {
        if (isBlank(id)) {
            return null;
        }
        return repository.findById(id.trim());
    }

    @Override
    public boolean actualizarDepartamento(String id, String nuevoDepartamento) {
        if (isBlank(id) || isBlank(nuevoDepartamento) || !repository.existsById(id.trim())) {
            return false;
        }
        return repository.updateDepartamento(id.trim(), nuevoDepartamento.trim());
    }

    @Override
    public boolean eliminarProfesor(String id) {
        if (isBlank(id) || !repository.existsById(id.trim())) {
            return false;
        }
        return repository.deleteById(id.trim());
    }

    @Override
    public boolean existeProfesor(String id) {
        return !isBlank(id) && repository.existsById(id.trim());
    }

    @Override
    public List<Profesor> listarProfesores() {
        return repository.findAll();
    }

    private boolean isBlank(String text) {
        return text == null || text.trim().isEmpty();
    }
}
