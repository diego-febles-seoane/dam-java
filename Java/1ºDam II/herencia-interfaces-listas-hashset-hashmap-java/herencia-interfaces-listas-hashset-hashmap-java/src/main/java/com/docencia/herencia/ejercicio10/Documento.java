package com.docencia.herencia.ejercicio10;

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
public abstract class Documento {

    private UUID id;
    private String titulo;

    protected Documento(UUID id, String titulo) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.titulo = titulo;
    }

    public UUID getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }

    /** Metodo abstracto para demostrar polimorfismo. */
    public abstract String tipo();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Documento documento = (Documento) o;
        return Objects.equals(id, documento.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Documento{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
