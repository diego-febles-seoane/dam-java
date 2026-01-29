package com.docencia.herencia.ejercicio9;

import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
public class Electronica extends Producto {

    private int garantiaMeses;

    public Electronica(UUID id, String nombre, double precio, int garantiaMeses) {
        super(id, nombre, precio);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    @Override
    public String categoria() {
        return "Electronica";
    }

    @Override
    public String toString() {
        return "Electronica{" +"id= "+getId()+
                "garantiaMeses=" + garantiaMeses +
                '}';
    }
}
