package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 *  @author: diego-febles-seoane
 *  @version: 1.0.0
 */
public class Ejercicio3 {
    static List<String> colores = new ArrayList<>(Arrays.asList("Amarrillo", "Rojo", "Azul", "Verde", "Turquesa"));
    static Vector<String> vector = new Vector<String>(colores);

    /**
     * Metodo que elimina colores
     * @param remove
     */
    static void eliminarColores (String letra){
        for (String palabra : colores) {
            if (palabra.startsWith(letra)) {
                vector.remove(palabra);
            }  
        }
    }
    public static void main(String[] args) {
        System.out.println(vector);
        eliminarColores("A");
        System.out.println(vector);
    }
}
