package com.docencia.clases.ejercicio4;

import java.util.Objects;

public class CuentaBancaria {
    private String iban;
    private String titular;
    private double saldo;

    public CuentaBancaria() {
        // TODO: constructor vacío (dejar valores por defecto o inicializar si lo necesitas)
    }

    public CuentaBancaria(String iban) {
        // TODO: constructor con identificador único
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: implementar equals comparando SOLO el identificador único (iban)
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        // TODO: implementar hashCode consistente con equals (usar SOLO el identificador único)
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO: implementar toString legible incluyendo al menos el identificador único
        return super.toString();
    }
}
