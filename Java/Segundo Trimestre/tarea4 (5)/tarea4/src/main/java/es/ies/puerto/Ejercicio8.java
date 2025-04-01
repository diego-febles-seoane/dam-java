package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 *  @author: diego-febles-seoane
 *  @version: 1.0.0
 */
public class Ejercicio8 {
    static List<String> lista1 = new ArrayList<>(Arrays.asList("Perro", "Gato"));
    static Vector<String> vectorA = new Vector<>(lista1);
    static List<String> lista2 = new ArrayList<>(Arrays.asList("Gato", "Caballo"));
    static Vector<String> vectorB = new Vector<>(lista2);
    static Vector<String> vectorCombinado = new Vector<>();

    /**
     * Metodo que fusiona vectores
     * @param vectorA
     * @param vectorB
     */
    static void fusionarVectores() {
        for (String palabra : vectorA) {
            if (!vectorCombinado.contains(palabra)) {
                vectorCombinado.add(palabra);
            }
        }
        for (String palabra : vectorB) {
            if (!vectorCombinado.contains(palabra)) {
                vectorCombinado.add(palabra);
            }
        }
    }
    public static void main(String[] args) {
        fusionarVectores();
        System.out.println("Vector A: " + vectorA + " Vector B: " + vectorB + " Combinado: " + vectorCombinado);
    }
}