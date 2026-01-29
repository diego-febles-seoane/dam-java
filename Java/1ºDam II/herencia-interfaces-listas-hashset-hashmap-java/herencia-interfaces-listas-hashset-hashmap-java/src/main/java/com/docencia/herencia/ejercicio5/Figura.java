package com.docencia.herencia.ejercicio5;

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
public abstract class Figura {

    private UUID id;
    private String color;

    protected Figura(UUID id, String color) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.color = color;
    }

    public UUID getId() { return id; }
    public String getColor() { return color; }

    /** Metodo abstracto para demostrar polimorfismo. */
    public abstract double area();

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Figura other = (Figura) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Figura: " +
            " id='" + getId() + "'" +
            ", color='" + getColor() + "'" +
            "}";
    }

}
