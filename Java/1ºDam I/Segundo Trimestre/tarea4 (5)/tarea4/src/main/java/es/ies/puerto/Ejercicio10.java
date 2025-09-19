package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author: diego-febles-seoane
 *  @version: 1.0.0
 */
public class Ejercicio10 {
    
    static List<Integer> numeros = new ArrayList<>(Arrays.asList(10,2,5,4,6));

    /**
     * Metodo que calcula el promedio de las notas
     * @param return 
     */
    static double calcularPromedio() {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return (double) suma / numeros.size();
    }
    
    public static void main(String[] args) {
        System.out.println("Calificaciones: " + numeros);
        System.out.println("Promedio: " + calcularPromedio());
    }
}