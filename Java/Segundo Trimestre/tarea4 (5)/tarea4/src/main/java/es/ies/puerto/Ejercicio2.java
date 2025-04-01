package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 *  @author: diego-febles-seoane
 *  @version: 1.0.0
 */
public class Ejercicio2 {
    static List<Integer> numeros = new ArrayList<>(Arrays.asList(1,2,5,4,5));
    static Vector<Integer> vector = new Vector<>(numeros);

    /**
     * Metodo para cambiar valores
     * @param posicion
     * @param cambio
     */
    static void modificarElementoVector(int posicion, int cambio) {
        vector.set(posicion, cambio);
    }
    public static void main(String[] args) {
        System.out.println("Numero en tercera pocicion: " + vector);
        Integer posicion = vector.get(2);
        modificarElementoVector(2, 10);
        System.out.println("Antes: " + posicion + ", Despues: " + vector );
    }
}