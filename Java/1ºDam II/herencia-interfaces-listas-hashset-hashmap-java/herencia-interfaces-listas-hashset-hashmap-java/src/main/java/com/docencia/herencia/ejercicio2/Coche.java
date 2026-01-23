package com.docencia.herencia.ejercicio2;

import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
public class Coche extends Vehiculo {

    private int puertas;

    public Coche(UUID id, String marca, String modelo, int puertas) {
        super(id, marca, modelo);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    @Override
    public int ruedas() {
        return 4;
    }


    @Override
    public String toString() {
        return "Coche: " +"id= "+getId()+
            " puertas='" + getPuertas() + "'" +
            "}";
    }
    
}
