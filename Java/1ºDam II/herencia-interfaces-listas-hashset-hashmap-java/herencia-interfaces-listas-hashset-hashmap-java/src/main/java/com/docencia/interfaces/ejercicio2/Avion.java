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
public class Avion implements Volador {

    private UUID id;
    private String modelo;
    private int motores;

    public Avion(UUID id, String modelo, int motores) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.modelo = modelo;
        this.motores = motores;
    }

    public UUID getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public int getMotores() {
        return motores;
    }

    @Override
    public int altitudMaxima() {
        return 12000;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Avion avion = (Avion) o;
        return Objects.equals(id, avion.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Avion{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", motores=" + motores +
                '}';
    }
}
