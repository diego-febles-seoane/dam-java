package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> numeros1 = new ArrayList<>();
        List<Integer> numeros2 = new ArrayList<>
        (Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(comprobarLista(numeros1));
        System.out.println(comprobarLista(numeros2));
    }

    /**
     * Metodo para comprobar si la lista esta vacia
     * @param list 
     * @return lista
     */
    public static List<Integer> comprobarLista(List<Integer> list) {
        if (!(list == null || list.isEmpty())) {
            list.removeIf(i -> i < 5);
            return list;
        }
        list.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        return list;
    }
}