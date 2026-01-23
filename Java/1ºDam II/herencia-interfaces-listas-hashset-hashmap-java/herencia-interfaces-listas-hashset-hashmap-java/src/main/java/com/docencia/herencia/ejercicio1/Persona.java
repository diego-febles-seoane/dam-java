package com.docencia.herencia.ejercicio1;

import java.util.Objects;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
/**
 * Clase base abstracta.
 * Incluye un identificador unico (UUID) y campos comunes.
 */
public abstract class Persona {

    private UUID id;
    private String nombre;
    private int edad;

    protected Persona(UUID id, String nombre, int edad) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    /** Metodo abstracto para demostrar polimorfismo. */
    public abstract String rol();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(id, persona.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Persona: " +
                " id='" + getId() + "'" +
                ", nombre='" + getNombre() + "'" +
                ", edad='" + getEdad() + "'" +
                "}";
    }

}
