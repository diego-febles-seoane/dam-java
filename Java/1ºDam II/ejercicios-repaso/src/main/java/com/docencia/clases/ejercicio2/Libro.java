package com.docencia.clases.ejercicio2;

import java.util.Objects;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;

    public Libro() {
        // TODO: constructor vacío (dejar valores por defecto o inicializar si lo necesitas)
    }

    public Libro(String isbn) {
        // TODO: constructor con identificador único
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: implementar equals comparando SOLO el identificador único (isbn)
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        // TODO: implementar hashCode consistente con equals (usar SOLO el identificador único)
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO: implementar toString legible incluyendo al menos el identificador único
        return super.toString();
    }
}
