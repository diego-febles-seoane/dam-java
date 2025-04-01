package es.ies.puerto.Ejercicio5;

/**
 * Crea un objeto de la clase Rectangulo con base 5 y altura 10. Muestra el área
 * calculada del rectángulo.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(3, 2);

        System.out.println(rectangulo);
        System.out.println("Area: " + rectangulo.area());
    }
}
