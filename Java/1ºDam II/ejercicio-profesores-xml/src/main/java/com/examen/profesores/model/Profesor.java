package com.examen.profesores.model;

import java.util.Objects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Representa un profesor del sistema.
 * La identidad logica del profesor viene dada por su id.
 */
public class Profesor {

    @JacksonXmlProperty(localName = "id", isAttribute = true)
    private String id;
    @JacksonXmlProperty(localName = "nombre")
    private String nombre;
    @JacksonXmlProperty(localName = "departamento")
    private String departamento;
    @JacksonXmlProperty(localName = "activo")
    private boolean activo;

    public Profesor() {
        // Constructor vacio para Jackson.
    }

    /**
     * Crea un nuevo profesor activo.
     *
     * @param id identificador unico del profesor
     * @param nombre nombre del profesor
     * @param departamento departamento del profesor
     */
    public Profesor(String id, String nombre, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.activo = true;
    }

    /**
     * 
     * @param id identificador unico del profesor
     */
    public Profesor(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Profesor profesor)) return false;
        return Objects.equals(id, profesor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id='" + id + "'" +
                ", nombre='" + nombre + "'" +
                ", departamento='" + departamento + "'" +
                ", activo=" + activo +
                '}';
    }
}
