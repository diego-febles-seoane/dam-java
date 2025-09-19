package es.ies.puerto.Ejercicio4;

import es.ies.puerto.Ejercicio3.Coche;

/**
 * Crea un objeto de la clase Coche con marca "Ford", modelo "Mustang", y año
 * 2020. Intenta asignar un año menor a 1886 y muestra el resultado de la
 * validación. 
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Coche coche = new Coche("Ford", "Mustang", 1885);

        coche.mostrarInformacion();
    }
}
