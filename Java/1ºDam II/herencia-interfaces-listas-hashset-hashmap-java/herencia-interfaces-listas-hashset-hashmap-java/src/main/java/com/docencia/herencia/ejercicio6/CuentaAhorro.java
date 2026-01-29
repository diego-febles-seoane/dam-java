package com.docencia.herencia.ejercicio6;

import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
public class CuentaAhorro extends CuentaBancaria {

    private double interesAnual;

    public CuentaAhorro(UUID id, String titular, double saldo, double interesAnual) {
        super(id, titular, saldo);
        this.interesAnual = interesAnual;
}

    public double getInteresAnual() { return interesAnual; }

    @Override
    public double comisionMensual() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "CuentaAhorro: " +"id= "+getId()+
            " interesAnual='" + getInteresAnual() + "'" +
            "}";
    }

}
