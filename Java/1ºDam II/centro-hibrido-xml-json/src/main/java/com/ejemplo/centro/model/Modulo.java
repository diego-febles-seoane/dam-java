package com.ejemplo.centro.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.Objects;

public class Modulo {

    @JacksonXmlProperty(isAttribute = true)
    private String id;
    private String nombre;
    private String profesorId;

    public Modulo() {
    }

    public Modulo(String id, String nombre, String profesorId) {
        this.id = id;
        this.nombre = nombre;
        this.profesorId = profesorId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(String profesorId) {
        this.profesorId = profesorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Modulo modulo)) return false;
        return Objects.equals(id, modulo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
