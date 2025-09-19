package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */

public class Ejercicio14 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = inicializarLista(20);
        System.out.println("Lista original: " + numeros);
        reemplazarConCero(numeros, 5, 10);
        System.out.println("Lista modificada: " + numeros);
    }
  
    public static ArrayList<Integer> inicializarLista(int cantidad) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            numeros.add(i);
        }
        return numeros;
    }

    public static void reemplazarConCero(List<Integer> numeros, int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            if (numeros.get(i) % 3 != 0) {
                numeros.set(i, 0);
            }
        }
    }
}