package com.docencia.composicion.ejercicio16;


import java.util.ArrayList;
import java.util.List;


public class Medicion {
    private final String dia;
    private final double temperatura;

    public Medicion(String dia, double temperatura) {
        this.dia = dia;
        this.temperatura = temperatura;
    }

    public String getDia() {
        return dia;
    }

    public double getTemperatura() {
        return temperatura;
    }
}
