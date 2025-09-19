package es.ies.puerto.Ejercicio18;

import es.ies.puerto.Ejercicio17.Vehiculo;

/**
 * Crea un objeto de la clase Vehiculo con marca "Ford", modelo "Fiesta", y
 * combustible 15 litros. Intenta asignar un valor negativo al combustible y
 * muestra el resultado de la validación.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Ford", "Fiesta", 15);

        vehiculo.agregarCombustible(-1);
        System.out.println(vehiculo);
    }
}
