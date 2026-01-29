package com.docencia.herencia.ejercicio6;

import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
public class CuentaCorriente extends CuentaBancaria {

    private double limiteDescubierto;

    public CuentaCorriente(UUID id, String titular, double saldo, double limiteDescubierto) {
        super(id, titular, saldo);
        this.limiteDescubierto = limiteDescubierto;
    }

    public double getLimiteDescubierto() {
        return limiteDescubierto;
    }

    @Override
    public double comisionMensual() {
        return 4.99;
    }


    @Override
    public String toString() {
        return "CuentaCorriente: " +"id= "+getId()+
            " limiteDescubierto='" + getLimiteDescubierto() + "'" +
            "}";
    }
    
}
