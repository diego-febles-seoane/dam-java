package com.docente.modelo;

public class Alumno extends PersonaAbstracta {

    private String curso;

    public Alumno(String identificador) {
        super(identificador);
    }

    public Alumno(String identificador, String nombre, int edad, String curso) {
        super(identificador, nombre, edad);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String toCsv() {
        return String.format("%s" + "|" + "%s" + "|" + "%d" + "|" + "%s", getIdentificador(),
                getNombre(), getEdad(), getCurso());
    }

    @Override
    public String toString() {
        return "Alumno [getCurso()=" + getCurso() + ", getIdentificador()=" + getIdentificador() + ", getNombre()="
                + getNombre() + ", getEdad()=" + getEdad() + "]";
    }

}
