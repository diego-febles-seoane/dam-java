package com.docencia.herencia.ejercicio4;

import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
public class Gato extends Animal {

    private boolean cazador;

    public Gato(UUID id, String nombre, boolean cazador) {
        super(id, nombre);
        this.cazador = cazador;
    }

    public boolean getCazador() {
        return cazador;
    }

    @Override
    public String sonido() {
        return "Miau";
    }

    @Override
    public String toString() {
        return "Gato: " +"id= "+getId()+
            " cazador='" + getCazador() + "'" +
            "}";
    }

}
