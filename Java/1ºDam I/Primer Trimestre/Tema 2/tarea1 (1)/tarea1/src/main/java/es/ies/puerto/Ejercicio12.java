package es.ies.puerto;

public class Ejercicio12 {
/**
 * Dada la transformación Saiyan en nivel 9000, convierte este número a hexadecimal y binario usando métodos de Integer.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    public static void main(String[] args) {
        int nivel = 9000;
        String hexadecimal = Integer.toHexString(nivel);
        String binario = Integer.toBinaryString(nivel);
        System.out.println("El nivel 9000 en hexadecimal es: " + hexadecimal);
        System.out.println("El nivel 9000 en binario es: " + binario);
    }
}