package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 *  @author: diego-febles-seoane
 *  @version: 1.0.0
 */
public class Ejercicio1 {
    static Vector<String> vector = new Vector<String>();
    /**
     * Metodo que añade al vector
     * @param add
     */
    static void aniadirFrutas (String fruta){
        vector.add(fruta);
    }
public static void main(String[] args) {
    aniadirFrutas("Manzana");
    aniadirFrutas("Banana");
    aniadirFrutas("Cereza");
    aniadirFrutas("Mango");
    aniadirFrutas("Uva");
    System.out.println(vector);
    }
}