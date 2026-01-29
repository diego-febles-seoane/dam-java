package com.docencia.herencia.ejercicio4;

import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
public class Perro extends Animal {

    private String raza;

    public Perro(UUID id, String nombre, String raza) {
        super(id, nombre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String sonido() {
        return "Guau";
    }

    @Override
    public String toString() {
        return "Perro: " +"id= "+getId()+
            " raza='" + getRaza() + "'" +
            "}";
    }

}
