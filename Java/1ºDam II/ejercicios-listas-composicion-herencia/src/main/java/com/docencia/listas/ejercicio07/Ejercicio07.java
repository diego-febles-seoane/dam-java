package com.docencia.listas.ejercicio07;

import java.util.Collections;
import java.util.List;

public class Ejercicio07 {

    private Ejercicio07() {
    }

    public static void ordenarConSort(List<Integer> lista) {
        Collections.sort(lista);
    }

    public static void ordenarSinSort(List<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size() -i -1; j++) {
                if (lista.get(j+1) < lista.get(j)){
                    int auxiliar = lista.get(j+1);
                    lista.set(j+1, lista.get(j));
                    lista.set(j, auxiliar);
                }
            }
        }
        System.out.println(lista);
    }
}
