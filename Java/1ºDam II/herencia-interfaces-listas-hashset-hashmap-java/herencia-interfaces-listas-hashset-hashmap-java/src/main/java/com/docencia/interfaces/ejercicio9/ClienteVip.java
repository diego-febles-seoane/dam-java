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
public class ClienteVip implements Descontable {

    private UUID id;
    private double porcentaje;
    private String nivel;

    public ClienteVip(UUID id, double porcentaje, String nivel) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.porcentaje = porcentaje;
        this.nivel = nivel;
    }

    public UUID getId() {
        return id;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public String getNivel() {
        return nivel;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - (precio * porcentaje);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ClienteVip that = (ClienteVip) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ClienteVip{" +
                "id=" + id +
                ", porcentaje=" + porcentaje +
                ", nivel='" + nivel + '\'' +
                '}';
    }
}
