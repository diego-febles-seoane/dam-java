package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */

public class Ejercicio19 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
    public static void main(String[] args) {
        System.out.println("Lista original: " + lista);
        int k = 3; 
        rotarLista(lista, k);
        System.out.println("Lista después de rotar " + k + " posiciones hacia la izquierda: " + lista);
    }

    

    public static boolean rotarLista(List<Integer> lista, int k) {
        if(lista == null || lista.isEmpty()) return false; 
        if(k == lista.size() || k < 0) return false;

        List<Integer> sublistaIzquierda = new ArrayList<>(lista.subList(0, k));
        List<Integer> sublistaDerecha = new ArrayList<>(lista.subList(k, lista.size()));

        lista.clear();
        lista.addAll(sublistaDerecha);
        lista.addAll(sublistaIzquierda);
        return true;
    }
}