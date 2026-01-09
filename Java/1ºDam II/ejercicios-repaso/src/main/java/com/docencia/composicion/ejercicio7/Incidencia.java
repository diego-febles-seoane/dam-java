package com.docencia.composicion.ejercicio7;


import java.util.ArrayList;
import java.util.List;


public class Incidencia {
    private final int id;
    private final String descripcion;
    private EstadoIncidencia estado;

    public Incidencia(int id, String descripcion, EstadoIncidencia estado) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public EstadoIncidencia getEstado() {
        return estado;
    }

    public void setEstado(EstadoIncidencia estado) {
        this.estado = estado;
    }
}
