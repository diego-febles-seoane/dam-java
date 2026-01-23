package com.docencia.interfaces.ejercicio2;

import java.util.Objects;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
/**
 * Implementacion concreta de Volador.
 */
public class Dron implements Volador {

    private UUID id;
    private String marca;
    private int bateriaMinutos;

    public Dron(UUID id, String marca, int bateriaMinutos) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.marca = marca;
        this.bateriaMinutos = bateriaMinutos;
    }

    public UUID getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public int getBateriaMinutos() {
        return bateriaMinutos;
    }

    @Override
    public int altitudMaxima() {
        return 500;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dron dron = (Dron) o;
        return Objects.equals(id, dron.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Dron{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", bateriaMinutos=" + bateriaMinutos +
                '}';
    }
}
