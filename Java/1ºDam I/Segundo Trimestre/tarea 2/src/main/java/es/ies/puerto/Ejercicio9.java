package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> lista2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(agregar(lista2, 7));
        System.out.println(removeIf(lista1));
        System.out.println("¿Son las listas iguales? " +lista1.equals(lista2));
        System.out.println(lista1);
        System.out.println(lista2);
    }

    /**
     * Metodo para agregar numeros a la lista
     * @param list
     * @return true/false
     */
    public static boolean agregar(List<Integer> list, int numero) {
        if (list == null) {
            return false;
        }
        return list.add(numero);
    }

    /**
     * Metodo para eliminar numero pares de la lista
     * @param list
     * @return lista sin numeros pares
     */
    public static List<Integer> removeIf(List<Integer> list) {
        if (list != null) {
            list.removeIf(numero -> numero % 2 == 0);
        }
        return list;
    }
}