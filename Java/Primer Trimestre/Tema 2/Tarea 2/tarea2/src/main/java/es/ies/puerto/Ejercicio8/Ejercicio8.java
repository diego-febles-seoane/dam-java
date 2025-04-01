package es.ies.puerto.Ejercicio8;

import es.ies.puerto.Ejercicio9.Empleado;

/**
 * Crea un objeto de la clase Empleado con nombre "Ana", puesto "Gerente", y
 * salario 5000. Asegúrate de que el salario no sea negativo.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Ana", "Gerente", 5000);

        empleado.mostrarInformacion();
        empleado.setSalario(-1);
    }
}
