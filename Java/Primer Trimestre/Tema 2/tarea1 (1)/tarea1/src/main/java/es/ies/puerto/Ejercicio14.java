package es.ies.puerto;

public class Ejercicio14 {
/**
 * Calcula la potencia de Superman en función de un poder inicial de 5 elevado a la fuerza de un enemigo (usa el método Math.pow()).
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    public static void main(String[] args) {
        int poderInicial =  5;
        int enemigo = 2;
        double potencia = Math.pow(poderInicial, enemigo);
        System.out.println("La potencia de Superman es: " + potencia);
    }
}