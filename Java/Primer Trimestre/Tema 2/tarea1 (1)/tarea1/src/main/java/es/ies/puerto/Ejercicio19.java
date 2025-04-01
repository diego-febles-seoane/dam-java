package es.ies.puerto;

public class Ejercicio19 {
/**
 * Crea un programa que simule el lanzamiento de un dado de 20 caras usando Math.random() y que imprima el resultado del lanzamiento.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    public static void main(String[] args) {
        int dado = (int) (Math.random() * 20) + 1;
        System.out.println("El resultado del lanzamiento del dado es: " + dado);
    }
}