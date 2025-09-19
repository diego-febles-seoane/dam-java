package es.ies.puerto;

public class Ejercicio21 {
/**
 * Dado el nombre "Thor Odinson", crea un programa que imprima solo el apellido usando substring() y indexOf().
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    public static void main(String[] args) {
        String nombre = "Thor Odinson";
        int posicion = nombre.indexOf(" ");
        String apellido = nombre.substring(posicion + 1);
        System.out.println(apellido);
    }
}