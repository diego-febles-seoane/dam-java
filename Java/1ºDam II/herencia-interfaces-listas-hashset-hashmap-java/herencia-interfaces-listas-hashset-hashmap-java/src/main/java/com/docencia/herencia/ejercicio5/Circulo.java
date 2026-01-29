package com.docencia.herencia.ejercicio5;

import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
public class Circulo extends Figura {

    private double radio;

    public Circulo(UUID id, String color, double radio) {
        super(id, color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double area() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public String toString() {
        return "Circulo: " + "id= " + getId() +
                " radio='" + getRadio() + "'" +
                "}";
    }

}
