package com.docencia.arrays.ejercicio1;

public class Ejercicio1 {
    /**
     * Suma todos los elementos del array. Si es null o vacío, devuelve 0.
     */
    public static int sumar(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return 0;
        }
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Ejercicio1 listo para implementar.");
    }
}
