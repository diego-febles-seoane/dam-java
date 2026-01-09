package com.docencia.composicion.ejercicio15;


import java.util.ArrayList;
import java.util.List;


public class Departamento {
    private final String nombre;
    private final List<Trabajador> trabajadores = new ArrayList<>();

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Trabajador> getTrabajadores() {
        return new ArrayList<>(trabajadores);
    }

    void anadirTrabajador(Trabajador t) {
        trabajadores.add(t);
    }
}
