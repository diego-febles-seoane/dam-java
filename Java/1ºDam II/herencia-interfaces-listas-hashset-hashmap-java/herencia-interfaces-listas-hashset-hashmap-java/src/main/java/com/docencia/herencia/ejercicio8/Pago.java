package com.docencia.herencia.ejercicio8;

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
public abstract class Pago {

    private UUID id;
    private double importe;

    protected Pago(UUID id, double importe) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.importe = importe;
    }

    public UUID getId() {
        return id;
    }

    public double getImporte() {
        return importe;
    }

    /** Metodo abstracto para demostrar polimorfismo. */
    public abstract boolean requiereValidacion();

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pago other = (Pago) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Pago{" +
                "id=" + getId() +
                ", importe=" + getImporte() +
                "}";
    }

}
