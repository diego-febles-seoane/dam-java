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
public class CirculoDrawable implements Drawable {

    private UUID id;
    private double radio;
    private String color;

    public CirculoDrawable(UUID id, double radio, String color) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.radio = radio;
        this.color = color;
    }

    public UUID getId() {
        return id;
    }

    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String dibujar() {
        return "Circulo r=" + radio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CirculoDrawable that = (CirculoDrawable) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "CirculoDrawable{" +
                "id=" + id +
                ", radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
