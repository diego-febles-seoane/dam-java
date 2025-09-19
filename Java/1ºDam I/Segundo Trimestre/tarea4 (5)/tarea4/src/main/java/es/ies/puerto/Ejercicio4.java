package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 *  @author: diego-febles-seoane
 *  @version: 1.0.0
 */
public class Ejercicio4 {
    static List<Integer> numeros = new ArrayList<>(Arrays.asList(1,2,5,4,5));
    static Vector<Integer> vector = new Vector<>(numeros);
    static Vector<Integer> vectorPares = new Vector<>();

    /**
     * Metodo que copia elementos pares
     * @param add 
     */
    static void copiarElementosPares(){
        for (int numero : vector) {
            if (numero % 2 == 0) {
                vectorPares.add(numero);
            }
        }
    }
    public static void main(String[] args) {
        copiarElementosPares();
        System.out.println("Vector original: " + vector);
        System.out.println("Vector con elementos pares: " + vectorPares);
    }
}