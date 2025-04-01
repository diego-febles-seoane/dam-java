package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */

public class Ejercicio13 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = inicializarLista(20);
        List<Integer> impares = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        dividirEnParesEImpares(numeros, impares, pares);
        numeros.clear();
        numeros.addAll(impares);
        numeros.addAll(pares);
        System.out.println("Lista final: " +numeros);
    }

    /**
     * Metodo para inicializar una lista con numeros dada una cantidad
     * @param cantidad
     * @return una lista de numeros
     */
    public static ArrayList<Integer> inicializarLista(int cantidad) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            numeros.add(i);
        }
        return numeros;
    }

    /**
     * Metodo para dividir los numeros en dos listas: una con impares y otra con pares
     * @param numeros 
     * @param impares 
     * @param pares  
     */
    public static void dividirEnParesEImpares(List<Integer> numeros, List<Integer> impares, List<Integer> pares) {
        numeros.forEach(numero -> {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        });
    }
}