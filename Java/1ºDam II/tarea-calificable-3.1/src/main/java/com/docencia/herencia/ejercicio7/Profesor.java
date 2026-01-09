package com.docencia.herencia.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    private final String especialidad;

    public Profesor(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String descripcionRol() {
        return "Profesor " + getNombre() + " de " + especialidad;
    }

    public static List<String> descripciones(List<Persona> personas) {
        List<String> result = new ArrayList<>();
        if (personas == null)
            return result;
        for (Persona p : personas) {
            if (p != null) {
                result.add(p.descripcionRol());
            }
        }
        return result;
    }
}
