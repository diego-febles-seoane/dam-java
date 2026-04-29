package com.ejemplo.service;

import java.util.List;

import com.ejemplo.model.Socio;
import com.ejemplo.model.SocioReserva;
import com.ejemplo.repository.ISocioRepository;
import com.ejemplo.repository.sqlite.SocioSqliteRepository;

public class SocioService implements ISocioService {

    private final ISocioRepository repository;

    public SocioService() {
        this.repository = new SocioSqliteRepository();
    }

    @Override
    public boolean create(Socio socio) {
        if (!validar(socio)) {
            return false;
        }
        return repository.create(socio);
    }

    private boolean validar(Socio socio) {
        if (socio == null) {
            return false;
        }
        if (socio.getNombre() == null || socio.getNombre().trim().isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public Socio findById(Integer id) {
        if (id == null || id <= 0) {
            return null;
        }
        return repository.findById(id);
    }

    @Override
    public List<Socio> findAll() {
        return repository.findAll();
    }

    @Override
    public boolean update(Socio socio) {
        if (!validar(socio) || socio.getId() == null || repository.findById(socio.getId()) == null) {
            return false;
        }
        return repository.update(socio);
    }

    @Override
    public boolean deleteById(Integer id) {
        if (id == null || id <= 0) {
            return false;
        }
        return repository.deleteById(id);
    }

    @Override
    public List<Socio> findActivos() {
        return repository.findActivos();
    }

    @Override
    public List<Socio> findByPlan(String plan) {
        if (plan == null || plan.trim().isEmpty()) {
            return List.of();
        }
        return repository.findByPlan(plan);
    }

    @Override
    public List<SocioReserva> findSociosConReservas() {
        return repository.findSociosConReservas();
    }

    
}
