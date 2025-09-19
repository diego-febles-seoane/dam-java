package es.ies.puerto;

public class Ejercicio27 {
/**
 * Dado el conteo de Midiclorianos de un Jedi, como 12500, convierte este número a hexadecimal y binario usando métodos de Integer.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    public static void main(String[] args) {
        int midiclorianos = 12500;
        String hexa = Integer.toHexString(midiclorianos);
        String binario = Integer.toBinaryString(midiclorianos);
        System.out.println("El conteo de Midiclorianos en hexadecimal es: " +  hexa);
        System.out.println("El conteo de Midiclorianos en binario es: "  +  binario);
    }
}