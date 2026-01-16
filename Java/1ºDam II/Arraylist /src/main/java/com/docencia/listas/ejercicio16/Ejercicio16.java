package com.docencia.listas.ejercicio16;

import java.util.List;

/**
 * Ejercicio 16
 *
 * Ejercicio de listas
 * 
 * @author santiago
 * @version 1.0.0
 */

public class Ejercicio16 {

    private Ejercicio16() {
    }

    public static void main(String[] args) {
        // Puedes ejecutar aquí pruebas manuales rápidas si lo deseas.
    }

    /**
     * Metodo para calcular la suma de las cadenas que no esten ni nulas ni vacias
     */
    public static int sumarLongitudesNoVacias(List<String> textos) {
        if (textos == null || textos.isEmpty()) {
            return 0;
        }
        int resultado = 0;
        for (String texto : textos) {
            if(texto != null)
                texto = texto.trim();
            if ( texto.isEmpty()) {
                resultado = resultado + texto.length();
            }
        }
        // Implementación provisional: siempre 0.
        return resultado;
    }

}
