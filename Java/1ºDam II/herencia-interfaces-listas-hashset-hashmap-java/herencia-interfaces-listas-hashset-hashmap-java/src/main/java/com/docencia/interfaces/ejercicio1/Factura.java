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
public class Factura implements Pagable {

    private UUID id;
    private double base;
    private double iva;

    public Factura(UUID id, double base, double iva) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.base = base;
        this.iva = iva;
    }

    public UUID getId() {
        return id;
    }

    public double getBase() {
        return base;
    }

    public double getIva() {
        return iva;
    }

    @Override
    public double total() {
        return base + (base * iva);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return Objects.equals(id, factura.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", base=" + base +
                ", iva=" + iva +
                '}';
    }
}
