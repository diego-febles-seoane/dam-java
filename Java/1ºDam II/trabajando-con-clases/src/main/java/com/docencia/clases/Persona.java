package com.docencia.clases;

/**
 * Clase Persona que identifica una persona de forma unica
 */
public class Persona extends Object{
    private String nombre;
    private int edad;
    private String identificador;

    /**
     * Constructor vacio
     */
    public Persona(){}

    /**
     * Constructor para busquedas de la clase
     * @param identificador Identificador de la persona
     */
    public Persona (String identificador) {
        this.identificador = identificador;
    }

    /**
     * Constructor con los parametros de la clase
     * @param indentificador Identidicador de la persona
     * @param nombre Nombre de la persona 
     * @param edad Edad de la persona
     */
    public Persona(String identificador, String nombre, int edad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            edad = 0;
        }
        this.edad = edad;
    }
    
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("nombre");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + nombre + "'" +
            ", edad='" + edad + "'" +
            ", identificador='" + identificador + "'" +
            "}";
    }


    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.setNombre("Ana");
        persona.setEdad(36);
        System.out.println(persona.nombre + " (" + persona.edad + ")");
        persona.setEdad(-1);
        System.out.println(persona.nombre + " (" + persona.edad + ")");
    }

}
