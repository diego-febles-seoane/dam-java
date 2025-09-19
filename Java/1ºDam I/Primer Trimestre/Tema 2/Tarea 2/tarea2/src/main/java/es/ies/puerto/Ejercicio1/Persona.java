package es.ies.puerto.Ejercicio1;

public class Persona {
    private String nombre;
    private int edad;

    /**
     * Constructor vacio de la clase Persona
     */
    public Persona() {

    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    /**
     * Metodo que no forma parte de la tarea, solo es un ejemplo
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    // Ejercico 2
    public int suma1Edad() {
        return this.edad + 1;
    }
}