package es.ies.puerto;

public class Ejercicio24 {
/**
 * Dada una dirección de Gotham como "Wayne Tower, Gotham City", usa el método split() para separar la torre del nombre de la ciudad.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    public static void main(String[] args) {
        String direccion = "Wayne Tower, Gotham City";
        String[] partesDireccion = direccion.split(", ");
        String torre = partesDireccion[0];
        String ciudad = partesDireccion[1];
        System.out.println("La torre es: " + torre);
    }
}