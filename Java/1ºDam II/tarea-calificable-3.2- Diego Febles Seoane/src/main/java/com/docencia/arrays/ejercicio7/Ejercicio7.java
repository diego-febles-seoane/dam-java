package com.docencia.arrays.ejercicio7;

/**
 * Ejercicio 7
 * @author diegofeblesseoane
 * @version 1.0.0
 */
public class Ejercicio7 {
    /**
     * Devuelve true si ambos arrays tienen la misma longitud y mismos valores en cada posición.
     */
    public static boolean sonIguales(int[] array1, int[] array2) {
        int tamanio1 = array1.length;
        int tamanio2 = array2.length;
        if (tamanio1 != tamanio2){
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Ejercicio7 listo para implementar.");
    }
}
