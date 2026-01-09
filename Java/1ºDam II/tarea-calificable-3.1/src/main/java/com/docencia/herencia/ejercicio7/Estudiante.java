package com.docencia.herencia.ejercicio7;

public class Estudiante extends Persona {
    private final String curso;

    public Estudiante(String nombre, String curso) {
        super(nombre);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String descripcionRol() {
        return "Estudiante " + getNombre() + " del curso " + curso;
    }
}
