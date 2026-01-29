package com.docencia.interfaces.ejercicio9;

import java.util.Objects;
import java.util.UUID;
/**
 * @author Héctor
 * @version 1.0.0
 */
/**
 * Implementacion concreta de Descontable.
 */
public class Cupon implements Descontable {

    private UUID id;
    private double importe;
    private String codigo;

    public Cupon(UUID id, double importe, String codigo) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.importe = importe;
        this.codigo = codigo;
    }

    public UUID getId() {
        return id;
    }

    public double getImporte() {
        return importe;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return Math.max(0.0, precio - importe);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cupon cupon = (Cupon) o;
        return Objects.equals(id, cupon.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Cupon{" +
                "id=" + id +
                ", importe=" + importe +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
