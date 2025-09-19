package es.ies.puerto.Ejercicio12;

/**
 * Crea un objeto de la clase Libro con título "El Quijote", autor "Cervantes",
 * y 500 páginas. Asegúrate de que el número de páginas sea positivo.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Libro libro = new Libro("El Quijote", "Cervantes", 500);

        System.out.println(libro);
    }
}
