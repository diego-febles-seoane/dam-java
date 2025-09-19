package es.ies.puerto.Ejercicio6;

import es.ies.puerto.Ejercicio5.Rectangulo;

/**
 * Crea un objeto de la clase Rectangulo con base 4 y altura 7. Muestra el
 * perímetro calculado del rectángulo.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(4, 7);

        System.out.println(rectangulo.perimetro());
    }
}
