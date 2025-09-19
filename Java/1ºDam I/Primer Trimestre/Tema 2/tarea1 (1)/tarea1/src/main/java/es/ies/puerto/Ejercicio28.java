package es.ies.puerto;

public class Ejercicio28 {
/**
 * Dado que el rayo de Thor tiene una velocidad v = 3 × 10^8 m/s y la distancia a la Tierra es d = 1.5 × 10^11 metros, calcula el tiempo que tarda en llegar usando la fórmula t = d / v.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    public static void main(String[] args) {
        double velocidad = 3 * Math.pow(10, 8);
        double distancia = 1.5 * Math.pow(10, 11);
        double tiempo = distancia / velocidad;
        System.out.println("El tiempo que tarda el rayo de Thor en llegar a la Tierra es: " + tiempo + " segundos");
    }
}