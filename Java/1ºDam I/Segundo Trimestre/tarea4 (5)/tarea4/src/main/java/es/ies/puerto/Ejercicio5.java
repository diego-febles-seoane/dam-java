package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 *  @author: diego-febles-seoane
 *  @version: 1.0.0
 */
public class Ejercicio5 {
    static List<Integer> numeros = new ArrayList<>(Arrays.asList(1,2,5,4,6));
    static Vector<Integer> vector = new Vector<>(numeros);

    /**
     * Metodo que ordena el vector
     * @param shuffle
     */
    static void ordenarVector(){
        Collections.shuffle(vector);
    }
    public static void main(String[] args) {
        System.out.println("Vector original: " + vector);
        ordenarVector();
        System.out.println("Vector ordenado aleatoriamente: " + vector);
    }
}