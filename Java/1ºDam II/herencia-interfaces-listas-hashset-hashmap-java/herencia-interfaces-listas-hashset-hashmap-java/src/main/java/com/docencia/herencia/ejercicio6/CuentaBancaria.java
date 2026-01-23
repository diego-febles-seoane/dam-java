package com.docencia.herencia.ejercicio6;

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
public abstract class CuentaBancaria {

    private UUID id;
    private String titular;
    private double saldo;

    protected CuentaBancaria(UUID id, String titular, double saldo) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.titular = titular;
        this.saldo = saldo;
    }

    public UUID getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    /** Metodo abstracto para demostrar polimorfismo. */
    public abstract double comisionMensual();

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
        final CuentaBancaria other = (CuentaBancaria) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "CuentaBancaria: "+
            " id='" + getId() + "'" +
            ", titular='" + getTitular() + "'" +
            ", saldo='" + getSaldo() + "'" +
            "}";
    }

}
