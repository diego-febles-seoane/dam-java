package com.ejemplo.repository;

import java.util.List;

import com.ejemplo.model.Clase;
import com.ejemplo.model.ClaseMonitor;
import com.ejemplo.model.ClaseReservaSocio;

public interface IClaseRepository {
    boolean create(Clase clase);
    List<Clase> findAll();
    Clase findById(Integer id);
    boolean update(Clase clase);
    boolean deleteById(Integer id);
    List<Clase> findDisponibles ();
    List<Clase> findByTipo(String tipo);
    List<Clase> findByMonitor(Integer idMonitor);
    List<ClaseMonitor> findClasesConMonitor();
    List<ClaseReservaSocio> findReservasConSocio();
    boolean monitorExists(Integer idMonitor);

}
