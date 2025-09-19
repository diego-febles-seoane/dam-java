package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>(Arrays.asList(2, 4, 6));
        List<Integer> lista2 = new ArrayList<>();
        System.out.println("Lista 1 inicial: " + lista1);
        System.out.println("Lista 2 inicial: " + lista2);
        List<Integer> listaResultado = validarYRellenarListas(lista1, lista2);
        System.out.println("Lista 1 después de validación: " + lista1);
        System.out.println("Lista 2 después de validación: " + lista2);
        System.out.println("Lista resultado (productos): " + listaResultado);
    }

    /**
     * Metodo para validar y rellenar dos listas
     * @param lista1 
     * @param lista2 
     * @return Lista con el producto de los elementos de lista1 y lista2 en las mismas 
     * posiciones, si ambas estan llenas
     */
    public static List<Integer> validarYRellenarListas(List<Integer> lista1, List<Integer> lista2) {
        if (lista1.isEmpty()) {
            lista1.addAll(generarNumerosImpares());
        }
        if (lista2.isEmpty()) {
            lista2.addAll(generarNumerosImpares());
        }
        if (!lista1.isEmpty() && !lista2.isEmpty()) {
            return calcularProductos(lista1, lista2);
        }
        return new ArrayList<>();
    }

    /**
     * Metodo para generar numeros impares del 1 al 10
     * @return Lista con numeros impares del 1 al 10
     */
    public static List<Integer> generarNumerosImpares() {
        List<Integer> impares = new ArrayList<>();
        for (int i = 1; i <= 10; i += 2) {
            impares.add(i);
        }
        return impares;
    }

    /**
     * Metodo para calcular el producto de los elementos en las mismas posiciones de dos 
     * listas
     * @param lista1 
     * @param lista2 
     * @return Lista con los productos de los elementos en las mismas posiciones
     */
    public static List<Integer> calcularProductos(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> productos = new ArrayList<>();
        int tamanio = Math.min(lista1.size(), lista2.size()); 
        for (int i = 0; i < tamanio; i++) {
            productos.add(lista1.get(i) * lista2.get(i));
        }
        return productos;
    }
}