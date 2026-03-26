package com.docente.modelo;

import java.util.Objects;

abstract class PersonaAbstracta {

    private final String identificador;
    private String nombre;
    private int edad;

    PersonaAbstracta(String identificador) {
        this.identificador = identificador;
    }

    PersonaAbstracta(String identificador, String nombre, int edad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getIdentificador() {
        return identificador;
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
    public int hashCode() {
        return Objects.hash(identificador);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }

        PersonaAbstracta other = (PersonaAbstracta) obj;
        if (identificador == null || other.getIdentificador() == null) {
            return false;
        }
        return identificador.equals(other.identificador);
    }


}
