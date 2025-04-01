package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> elementos = new ArrayList<>
        (Arrays.asList("coche", "casa", "balon", "tele", "sillon"));
        String elemento1 = "auto";
        String elemento2 = "Coche";
        System.out.println(add(elementos, elemento1));
        System.out.println(add(elementos, elemento2));
    }

    /**
     * Metodo para agregar elementos a una lista
     * @return lista
     */
    public static List<String> add(List<String> list, String nuevoElemento) {
        nuevoElemento = nuevoElemento.toLowerCase();
        if (list.contains(nuevoElemento)) {
            return list;
        }
        list.add(nuevoElemento);
        Collections.sort(list);
        return list;
    }
}