package com.ejemplo.centro.model;

import java.util.Objects;

public class Evaluacion {
    private String alumno;
    private String moduloId;
    private double nota;

    public Evaluacion() {
    }

    public Evaluacion(String alumno, String moduloId, double nota) {
        this.alumno = alumno;
        this.moduloId = moduloId;
        this.nota = nota;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getModuloId() {
        return moduloId;
    }

    public void setModuloId(String moduloId) {
        this.moduloId = moduloId;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Evaluacion that)) return false;
        return Objects.equals(alumno, that.alumno) && Objects.equals(moduloId, that.moduloId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alumno, moduloId);
    }
}
