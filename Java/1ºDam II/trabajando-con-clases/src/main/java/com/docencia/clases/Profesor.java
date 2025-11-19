package com.docencia.clases;

public class Profesor extends Alumno {
    private String cursoImparte;

     public Profesor() {
        super();
     }

    public Profesor(String identificador, String nombre, 
        int edad, String cursoEstudia, String cursoImparte) {
        
        super(identificador, nombre, edad, cursoEstudia);
        this.cursoImparte = cursoImparte;
    
    }
    public static void main(String[] args) {
        Profesor profesor = new Profesor();
        System.out.println(profesor.getEdad());
    }
}
