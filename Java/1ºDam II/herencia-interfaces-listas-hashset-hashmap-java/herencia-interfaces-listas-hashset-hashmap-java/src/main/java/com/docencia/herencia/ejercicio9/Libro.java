package com.docencia.herencia.ejercicio9;

import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
public class Libro extends Producto {

    private String isbn;

    public Libro(UUID id, String nombre, double precio, String isbn) {
        super(id, nombre, precio);
        this.isbn = isbn;
}

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String categoria() {
        return "Libro";
    }

    @Override
    public String toString() {
        return "Libro{" +"id="+getId()+
                "isbn='" + isbn + '\'' +
                '}';
    }
}
