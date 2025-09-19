package es.ies.puerto.Ejercicio2;

import es.ies.puerto.Ejercicio1.Persona;

/**
 * Crea un objeto de la clase Persona con nombre "Maria" y edad 25. Modifica la
 * edad a 26 usando el setter y muestra la edad actualizada.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Persona persona = new Persona("María", 25);

        persona.mostrarInformacion();
        persona.setEdad(26);
        System.out.println("Edad modificada: " + persona.getEdad());
    }
}