package com.docencia.clases.ejercicio1;

import java.util.Objects;

public class Persona {
    private String dni;
    private String nombre;
    private int edad;

    public Persona() {
        // TODO: constructor vacío (dejar valores por defecto o inicializar si lo necesitas)
    }

    public Persona(String dni) {
        // TODO: constructor con identificador único
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: implementar equals comparando SOLO el identificador único (dni)
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        // TODO: implementar hashCode consistente con equals (usar SOLO el identificador único)
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO: implementar toString legible incluyendo al menos el identificador único
        return super.toString();
    }
}
