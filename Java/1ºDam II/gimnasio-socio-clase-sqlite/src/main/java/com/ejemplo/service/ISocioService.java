package com.ejemplo.service;

import com.ejemplo.model.Socio;
import com.ejemplo.model.SocioReserva;

import java.util.List;

public interface ISocioService {

    /**
     * Crea un socio nuevo del gimnasio validando los campos obligatorios.
     * @param socio socio a crear.
     * @return true si se crea el socio.
     */
    boolean create(Socio socio);

    /**
     * Busca un socio por identificador y devuelve el elemento si existe.
     * @param id identificador del socio.
     * @return socio encontrado.
     */
    Socio findById(Integer id);
    List<Socio> findAll();
    boolean update(Socio socio);
    boolean deleteById(Integer id);
    List<Socio> findActivos();
    List<Socio> findByPlan(String plan);
    List<SocioReserva> findSociosConReservas();
}
