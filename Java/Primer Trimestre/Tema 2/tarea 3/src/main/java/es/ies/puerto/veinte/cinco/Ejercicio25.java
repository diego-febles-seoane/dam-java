package es.ies.puerto.veinte.cinco;
/**
 * Crea una clase Concesionaria con una lista (array) (array) de vehículos (clase Vehiculo). Implementa métodos para agregar vehículos, listar todos los vehículos y usar toString() para mostrar detalles.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario(5);
        Vehiculo vehiculo1 = new Vehiculo("Porche", "911");
        concesionario.agregarVehiculo(vehiculo1);
        Vehiculo vehiculo2 = new Vehiculo("Mclaren", "P1");
        concesionario.agregarVehiculo(vehiculo2);
        Vehiculo vehiculo3 = new Vehiculo("Ferrari", "488");
        concesionario.agregarVehiculo(vehiculo3);
        Vehiculo vehiculo4 = new Vehiculo("Lamborghini", "Hurac");
        concesionario.agregarVehiculo(vehiculo4);
        Vehiculo vehiculo5 = new Vehiculo("Aston Martin", "DBS");
        concesionario.agregarVehiculo(vehiculo5);
        System.out.println("Concesionario" + concesionario);
    }
    

}
