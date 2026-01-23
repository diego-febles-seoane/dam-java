package com.docencia.herencia.ejercicio3;

import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
public class Gerente extends Empleado {

    private int numReportes;

    public Gerente(UUID id, String nombre, double salarioBase, int numReportes) {
        super(id, nombre, salarioBase);
        this.numReportes = numReportes;
    }

    public int getNumReportes() {
        return numReportes;
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.20;
    }


    @Override
    public String toString() {
        return "Gerente: " +"id= "+getId()+
            " numReportes='" + getNumReportes() + "'" +
            "}";
    }

}
