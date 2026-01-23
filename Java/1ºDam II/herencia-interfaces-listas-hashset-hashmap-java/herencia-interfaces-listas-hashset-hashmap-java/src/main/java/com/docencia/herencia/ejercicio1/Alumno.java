package com.docencia.herencia.ejercicio1;

import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
public class Alumno extends Persona {

    private String matricula;

    public Alumno(UUID id, String nombre, int edad, String matricula) {
        super(id, nombre, edad);
        if (matricula == null || matricula.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String rol() {
        return "Alumno";
    }


    @Override
    public String toString() {
        return "Alumno: " +"id= "+ getId()+
            " matricula='" + getMatricula() + "'" +
            "}";
    }
}
