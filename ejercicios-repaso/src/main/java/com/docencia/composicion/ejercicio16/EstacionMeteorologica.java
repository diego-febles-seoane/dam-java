package com.docencia.composicion.ejercicio16;


import java.util.ArrayList;
import java.util.List;


public class EstacionMeteorologica {
    private final List<Medicion> mediciones = new ArrayList<>();

    public void registrarMedicion(String dia, double temperatura) {
        // TODO: validar día.
        if (dia != null) {
            mediciones.add(new Medicion(dia, temperatura));
        }
    }

    public Double maximaTemperatura() {
        // TODO: devolver máxima temperatura o null si no hay mediciones.
        return null;
    }

    public long diasPorEncimaDe(double umbral) {
        // TODO: contar mediciones por encima del umbral.
        return 0L;
    }

    public List<Medicion> getMediciones() {
        return new ArrayList<>(mediciones);
    }
}
