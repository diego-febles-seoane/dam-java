package com.docencia.interfaces.ejercicio10;

import java.util.Objects;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
/**
 * Implementacion concreta de Drawable.
 */
public class CuadradoDrawable implements Drawable {

    private UUID id;
    private double lado;
    private String color;

    public CuadradoDrawable(UUID id, double lado, String color) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.lado = lado;
        this.color = color;
    }

    public UUID getId() {
        return id;
    }

    public double getLado() {
        return lado;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String dibujar() {
        return "Cuadrado l=" + lado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CuadradoDrawable that = (CuadradoDrawable) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "CuadradoDrawable{" +
                "id=" + id +
                ", lado=" + lado +
                ", color='" + color + '\'' +
                '}';
    }
}
