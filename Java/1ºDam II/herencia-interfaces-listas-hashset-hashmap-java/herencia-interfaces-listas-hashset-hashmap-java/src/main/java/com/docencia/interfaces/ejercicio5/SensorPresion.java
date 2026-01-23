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
public class SensorPresion implements Medible {

    private UUID id;
    private String ubicacion;
    private double kpa;

    public SensorPresion(UUID id, String ubicacion, double kpa) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.ubicacion = ubicacion;
        this.kpa = kpa;
    }

    public UUID getId() {
        return id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public double getKpa() {
        return kpa;
    }

    @Override
    public double medir() {
        return kpa;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SensorPresion that = (SensorPresion) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "SensorPresion{" +
                "id=" + id +
                ", ubicacion='" + ubicacion + '\'' +
                ", kpa=" + kpa +
                '}';
    }
}
