package com.docencia.interfaces.ejercicio1;

import java.util.Objects;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
/**
 * Implementacion concreta de Pagable.
 */
public class Nomina implements Pagable {

    private UUID id;
    private double bruto;
    private double retencion;

    public Nomina(UUID id, double bruto, double retencion) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.bruto =bruto;
        this.retencion = retencion;
    }

    public UUID getId() {
        return id;
    }

    public double getBruto() {
        return bruto;
    }

    public double getRetencion() {
        return retencion;
    }

    @Override
    public double total() {
        return bruto - (bruto * retencion);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Nomina nomina = (Nomina) o;
        return Objects.equals(id, nomina.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Nomina{" +
                "id=" + id +
                ", bruto=" + bruto +
                ", retencion=" + retencion +
                '}';
    }
}
