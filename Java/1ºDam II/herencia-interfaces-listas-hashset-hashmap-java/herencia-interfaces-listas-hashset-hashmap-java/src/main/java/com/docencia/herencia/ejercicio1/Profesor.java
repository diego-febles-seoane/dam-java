package com.docencia.herencia.ejercicio1;

import java.util.UUID;
/**
 * @author Héctor
 * @version 1.0.0
 */
public class Profesor extends Persona {

    private String departamento;

    public Profesor(UUID id, String nombre, int edad, String departamento) {
        super(id, nombre, edad);
        if (departamento == null || departamento.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String rol() {
        return "Profesor";
    }

    @Override
    public String toString() {
        return "Profesor: " +"id= "+getId()+
                " departamento='" + getDepartamento() + "'" +
                "}";
    }

}
