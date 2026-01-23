package com.docencia.herencia.ejercicio2;

import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
public class Motocicleta extends Vehiculo {

    private boolean tieneSidecar;

    public Motocicleta(UUID id, String marca, String modelo, boolean tieneSidecar) {
        super(id, marca, modelo);
        this.tieneSidecar = tieneSidecar;
    }

    public boolean getTieneSidecar() {
        return tieneSidecar;
    }

    @Override
    public int ruedas() {
        return 2;
    }

    @Override
    public String toString() {
        return "Motocicleta: " + "id= " + getId() +
                " tieneSidecar='" + getTieneSidecar() + "'" +
                "}";
    }

}
