package com.docencia.herencia.ejercicio5;

import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
public class Rectangulo extends Figura {

    private double ancho;
    private double alto;

    public Rectangulo(UUID id, String color, double ancho, double alto) {
        super(id, color);
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    @Override
    public double area() {
        return getAncho() * getAlto();
    }

    @Override
    public String toString() {
        return "Rectangulo: " + "id= " + getId() +
                " ancho='" + getAncho() + "'" +
                ", alto='" + getAlto() + "'" +
                "}";
    }

}
