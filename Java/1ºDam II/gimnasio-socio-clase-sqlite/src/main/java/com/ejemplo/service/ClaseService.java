package com.ejemplo.service;

import java.util.List;

import com.ejemplo.model.Clase;
import com.ejemplo.model.ClaseMonitor;
import com.ejemplo.model.ClaseReservaSocio;
import com.ejemplo.repository.IClaseRepository;

public class ClaseService implements IClaseService {

    private final IClaseRepository repository;

    public ClaseService(IClaseRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean create(Clase clase) {
        if (!validar(clase)) {
            return false;
        }
        if (!repository.monitorExists(clase.getIdMonitor())) {
            return false;
        }
        return repository.create(clase);
    }

    private boolean validar(Clase clase) {
        if (clase == null) {
            return false;
        }
        if (clase.getNombre() == null || clase.getNombre().trim().isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public Clase findById(Integer id) {
        if (id == null || id <= -1) {
            return null;
        }
        return repository.findById(id);
    }

    @Override
    public List<Clase> findAll() {
        return repository.findAll();
    }

    @Override
    public boolean update(Clase clase) {
        if (!validar(clase) || clase.getId() == null || repository.findById(clase.getId()) == null) {
            return false;
        }
        return repository.update(clase);
    }

    @Override
    public boolean deleteById(Integer id) {
        if (id == null || id <= 0) {
            return false;
        }
        return repository.deleteById(id);
    }

    @Override
    public List<Clase> findDisponibles() {
        return repository.findDisponibles();
    }

    @Override
    public List<Clase> findByTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            return new java.util.ArrayList<>();
        }
        return repository.findByTipo(tipo);
    }

    @Override
    public List<Clase> findByMonitor(Integer idMonitor) {
        if (idMonitor == null || idMonitor <= 0) {
            return new java.util.ArrayList<>();
        }
        return repository.findByMonitor(idMonitor);
    }

    @Override
    public List<ClaseMonitor> findClasesConMonitor() {
        return repository.findClasesConMonitor();
    }

    @Override
    public List<ClaseReservaSocio> findReservasConSocio() {
        return repository.findReservasConSocio();
    }

}
