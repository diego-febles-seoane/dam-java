
package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        List<Integer> numeros = generarNumerosAleatorios(20); 
        System.out.println("Lista original: " + numeros);
        eliminarNumeros(numeros);
        if (!numeros.isEmpty()) {
            System.out.println("Lista después de eliminar elementos: " + numeros);
        } else {
            System.out.println("La lista está vacía después de la operación.");
        }
    }

    /**
     * Metodo para generar una lista de numeros aleatorios entre 90 y 110.
     * @param cantidad Numero de elementos a generar.
     * @return Lista con números aleatorios.
     */
    public static List<Integer> generarNumerosAleatorios(int cantidad) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            int numero = 90 + (int) (Math.random() * 21); 
            numeros.add(numero);
        }
        return numeros;
    }

    /**
     * Metodo para eliminar numeros negativos y mayores que 100 de una lista.
     * @param numeros Lista de números.
     */
    public static void eliminarNumeros(List<Integer> numeros) {
        numeros.removeIf(num -> num < 0 || num > 100); 
    }
}