package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 *  @author: diego-febles-seoane
 *  @version: 1.0.0
 */
public class Ejercicio7 {
    static List<String> palabras = new ArrayList<>(Arrays.asList("Pez", "Tibetano", "Homologado", "Mano", "Toalla"));
    static Vector<String> vector = new Vector<String>(palabras);
    static int contador = 0;

    /**
     * Metodo que cuenta palabras
     */
    static void contarNombresLargos(){
        for (String palabra : palabras) {
            if (palabra.length() > 5) {
                contador++;
            }
        }
    }
    public static void main(String[] args) {
        contarNombresLargos();
        System.out.println("Hay " + contador + " países con más de 5 caracteres");
    }
}