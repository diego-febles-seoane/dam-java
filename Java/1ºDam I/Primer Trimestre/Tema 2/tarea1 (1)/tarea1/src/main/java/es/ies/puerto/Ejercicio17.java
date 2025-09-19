package es.ies.puerto;

public class Ejercicio17 {
/**
 * Simula el daño crítico de un ataque multiplicando el daño base por un número aleatorio entre 1.5 y 2.0 usando Math.random().200 de daño base. Un valor aleatorio entre 300.0 y 400.0
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    public static void main(String[] args) {
        double daño = 200.0;
        double dañoCritico = 1.5 + (Math.random() * (2 - 1.5));
        double  dañoTotal = daño * dañoCritico;
        System.out.println("El daño crítico es: " + dañoTotal);
    }
}