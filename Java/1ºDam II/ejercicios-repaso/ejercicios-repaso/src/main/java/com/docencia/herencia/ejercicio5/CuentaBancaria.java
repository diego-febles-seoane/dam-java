package com.docencia.herencia.ejercicio5;


import java.util.List;


public abstract class CuentaBancaria {
    private final String numeroCuenta;
    protected double saldo;

    protected CuentaBancaria(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
        // TODO: ingresar solo cantidades positivas.
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public abstract void retirar(double cantidad);
}
