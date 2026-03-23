package com.docente.modelo;

import static com.docente.utils.Utilidades.DELIMITER;

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
        return String.format("%s"+DELIMITER+"%s"+DELIMITER+"%d"+DELIMITER+"%s", getIdentificador(), getNombre(), getEdad(), getCurso());
    }
}
