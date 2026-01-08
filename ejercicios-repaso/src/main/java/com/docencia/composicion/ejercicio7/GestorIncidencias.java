package com.docencia.composicion.ejercicio7;


import java.util.ArrayList;
import java.util.List;


public class GestorIncidencias {
    private final List<Incidencia> incidencias = new ArrayList<>();
    private int siguienteId = 1;

    public Incidencia crearIncidencia(String descripcion) {
        // TODO: validar descripción y crear una incidencia ABIERTA con id incremental.
        if (descripcion == null) {
            return null;
        }
        Incidencia inc = new Incidencia(siguienteId++, descripcion, EstadoIncidencia.ABIERTA);
        incidencias.add(inc);
        return inc;
    }

    public boolean cerrarIncidencia(int id) {
        // TODO: cerrar incidencia si existe y está ABIERTA.
        return false;
    }

    public long contarAbiertas() {
        // TODO: contar incidencias en estado ABIERTA.
        return 0L;
    }

    public List<Incidencia> getIncidencias() {
        return new ArrayList<>(incidencias);
    }
}
