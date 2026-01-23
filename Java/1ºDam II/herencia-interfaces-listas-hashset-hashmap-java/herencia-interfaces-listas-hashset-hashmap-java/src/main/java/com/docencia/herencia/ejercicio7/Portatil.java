package com.docencia.herencia.ejercicio7;

import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
public class Portatil extends Dispositivo {

    private double pulgadas;

    public Portatil(UUID id, String fabricante, double pulgadas) {
        super(id, fabricante);
        this.pulgadas = pulgadas;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    @Override
    public String tipo() {
        return "Portatil";
    }

    @Override
    public String toString() {
        return "Portatil: " +"id= "+getId()+
            " pulgadas='" + getPulgadas() + "'" +
            "}";
    }

}
