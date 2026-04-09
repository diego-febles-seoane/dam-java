package com.ejemplo.centro.model;

import java.util.Objects;

public class Incidencia {
    private String profesorId;
    private String descripcion;
    private String fecha;

    public Incidencia() {
    }

    public Incidencia(String profesorId, String descripcion, String fecha) {
        this.profesorId = profesorId;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(String profesorId) {
        this.profesorId = profesorId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Incidencia that)) return false;
        return Objects.equals(profesorId, that.profesorId) &&
               Objects.equals(descripcion, that.descripcion) &&
               Objects.equals(fecha, that.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profesorId, descripcion, fecha);
    }
}
