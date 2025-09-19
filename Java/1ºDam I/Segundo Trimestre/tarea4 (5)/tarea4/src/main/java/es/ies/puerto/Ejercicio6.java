package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 *  @author: diego-febles-seoane
 *  @version: 1.0.0
 */
public class Ejercicio6 {
    static List<String> paises = new ArrayList<>(Arrays.asList("España", "Canada", "Argentina", "Inglaterra", "Turquia"));
    static Vector<String> vector = new Vector<String>(paises);

    /**
     * Metodo que verifica
     * @param boolean
     */
    static void verificarPresenciaElemento(String elementoBuscado){
        boolean estaPresente = vector.contains(elementoBuscado);
        System.out.println("El país buscado es: " + elementoBuscado);
        System.out.println("Este se encuentra en el vector: " + estaPresente);
    }

    public static void main(String[] args) {
        verificarPresenciaElemento("España");
    }
}