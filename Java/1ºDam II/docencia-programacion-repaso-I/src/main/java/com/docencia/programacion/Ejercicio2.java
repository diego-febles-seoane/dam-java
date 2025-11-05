package com.docencia.programacion;

/**
 * @author jpexposito
 * @version 1.0.0
 * Clase que implementa el ejercicio numero 2
 */
public class Ejercicio2 {

    /**
     * Funcion que crea un mensaje de saludo
     * @param name Nombre de la persona a saludar
     * @return String con la cadena de saludo
     */
    public static String buildGreeting(String name) {

        if (name == null || name.isEmpty()) {
            return "Hola.";
        }
        return "Hola, " +name+".";
    }
}
