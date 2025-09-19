package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */

public class Ejercicio18 {
    static List<String> lista1 = new ArrayList<>(Arrays.asList("Ana", "Juan", "Pedro", "Lucía", "María"));
    static List<String> lista2 = new ArrayList<>(Arrays.asList("Pedro", "Lucía", "Carlos", "Ana"));

    public static void main(String[] args) {
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        List<String> listaModificada = obtenerDiferencia(lista1, lista2);
        System.out.println("Lista modificada: " +listaModificada);
    }

    public static List<String> obtenerDiferencia(List<String> lista1, List<String> lista2) {
        List<String> listaModificada = new ArrayList<>(lista1);
        listaModificada.removeAll(lista2);
        return listaModificada;
    }
}