package com.docencia.app;
import java.util.Objects;

public class Persona{
    private String identificador;
    private String nombre;
    private int edad;


    public Persona() {
    }

    public Persona(String identificador, String nombre, int edad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona identificador(String identificador) {
        setIdentificador(identificador);
        return this;
    }

    public Persona nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Persona edad(int edad) {
        setEdad(edad);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(identificador, persona.identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador);
    }

    @Override
    public String toString() {
        return "{" +
            " identificador='" + getIdentificador() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            "}";
    }
    
}