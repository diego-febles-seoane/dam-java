package com.ejemplo.service;

import com.ejemplo.model.Clase;
import com.ejemplo.model.ClaseMonitor;
import com.ejemplo.model.ClaseReservaSocio;

import java.util.List;

public interface IClaseService {
    
    /**
     * Metodo que crea la clase
     * @param clase 
     * @return true/false
     */
    boolean create(Clase clase);
    Clase findById(Integer id);
    List<Clase> findAll();
    boolean update(Clase clase);
    boolean deleteById(Integer id);
    List<Clase> findDisponibles();
    List<Clase> findByTipo(String tipo);
    List<Clase> findByMonitor(Integer idMonitor);
    List<ClaseMonitor> findClasesConMonitor();
    List<ClaseReservaSocio> findReservasConSocio();
}
