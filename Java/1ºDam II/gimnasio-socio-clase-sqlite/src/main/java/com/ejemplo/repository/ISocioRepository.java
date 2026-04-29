package com.ejemplo.repository;

import com.ejemplo.model.Socio;
import com.ejemplo.model.SocioReserva;

import java.util.List;

public interface ISocioRepository {
    boolean create(Socio socio);
    Socio findById(Integer id);
    List<Socio> findAll();
    boolean update(Socio socio);
    boolean deleteById(Integer id);
    List<Socio> findActivos();
    List<Socio> findByPlan(String plan);
    List<SocioReserva> findSociosConReservas();
}
