package com.docencia.interfaces.ejercicio5;

import java.util.Objects;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
/**
 * Implementacion concreta de Medible.
 */
public class SensorTemperatura implements Medible {

    private UUID id;
    private String ubicacion;
    private double celsius;

    public SensorTemperatura(UUID id, String ubicacion, double celsius) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.ubicacion = ubicacion;
        this.celsius = celsius;
    }

    public UUID getId() {
        return id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public double getCelsius() {
        return celsius;
    }

    @Override
    public double medir() {
        return celsius;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SensorTemperatura that = (SensorTemperatura) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "SensorTemperatura{" +
                "id=" + id +
                ", ubicacion='" + ubicacion + '\'' +
                ", celsius=" + celsius +
                '}';
    }
}
