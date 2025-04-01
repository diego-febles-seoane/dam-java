package es.ies.puerto.Ejercicio17;

/**
 * Crea un objeto de la clase Vehiculo con marca "Honda", modelo "Civic", y
 * combustible 40 litros. Agrega 20 litros de combustible al vehículo.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Honda", "Civic", 40);

        vehiculo.agregarCombustible(20);
        System.out.println(vehiculo);
    }
}
