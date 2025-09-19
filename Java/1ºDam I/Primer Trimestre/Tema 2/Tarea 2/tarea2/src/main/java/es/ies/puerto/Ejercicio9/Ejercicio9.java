package es.ies.puerto.Ejercicio9;

/**
 * Crea un objeto de la clase Empleado con nombre "Carlos", puesto "Ingeniero" y
 * salario 3000. Intenta asignar un puesto vacío y muestra el resultado de la
 * validación.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos", "Ingeniero", 3000);

        empleado.mostrarInformacion();
        empleado.setPuesto(null);
    }
}
