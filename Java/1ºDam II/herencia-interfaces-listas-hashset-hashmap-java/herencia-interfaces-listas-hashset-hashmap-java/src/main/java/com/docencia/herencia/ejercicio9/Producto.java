package com.docencia.herencia.ejercicio9;

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
public abstract class Producto {

    private UUID id;
    private String nombre;
    private double precio;

    protected Producto(UUID id, String nombre, double precio) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public UUID getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    /** Metodo abstracto para demostrar polimorfismo. */
    public abstract String categoria();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(id, producto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
