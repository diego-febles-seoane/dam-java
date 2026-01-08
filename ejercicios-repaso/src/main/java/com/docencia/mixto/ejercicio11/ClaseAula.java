package com.docencia.mixto.ejercicio11;

import java.util.Objects;

public class ClaseAula {
    private String codigo;
    private int capacidad;
    private int ocupacion;

    public ClaseAula() {
        // TODO: constructor vacío
    }

    public ClaseAula(String codigo, int capacidad, int ocupacion) {
        // TODO: constructor con identificador y datos
        this.codigo = codigo;
        this.capacidad = capacidad;
        this.ocupacion = ocupacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(int ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: equals basado SOLO en el identificador único
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        // TODO: hashCode consistente con equals
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO: toString legible
        return super.toString();
    }
}
