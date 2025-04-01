package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>(Arrays.asList(1, 7, 3, 4, 5));
        List<Integer> lista2 = new ArrayList<>(Arrays.asList(6, 7, 5, 9));
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        List<Integer> elementosUnicos = fusionarElementosUnicos(lista1, lista2);
        System.out.println("Lista de elementos unicos: " + elementosUnicos);
    }

    /**
     * Metodo para fusionar dos listas y obtener solo los elementos únicos.
     * @param lista1 
     * @param lista2 
     * @return Lista con los elementos unicos
     */
    public static List<Integer> fusionarElementosUnicos(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> fusion = new ArrayList<>(lista1);
        fusion.addAll(lista2); 
        List<Integer> elementosComunes = new ArrayList<>(lista1);
        elementosComunes.retainAll(lista2); 
        fusion.removeAll(elementosComunes);
        return fusion;
    }
}