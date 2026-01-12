package com.docencia.listas.ejercicio16;


import java.util.ArrayList;
import java.util.List;


/**
 * Ejercicio 16
 *
 * Clase lanzadora (opcional) y contenedor de métodos del enunciado.
 * @author diegofeblesseaone
 * @version 1.0.0
 */

public class Ejercicio16 {

    private Ejercicio16() {
    }

    public static void main(String[] args) {
        // Puedes ejecutar aquí pruebas manuales rápidas si lo deseas.
    }


    /**
     * Metodo para sumar la longitudes de los string de una lista
     * @param textos lista de string
     * @return suma
     */
    public static int sumarLongitudesNoVacias(List<String> textos) {
        if (textos == null || textos.isEmpty()){
            return 0;
        }
        int suma = 0;
        for (String string : textos) {
            if (string == null || string.isBlank()){
                continue;
            }
            String stringTrim = string.trim();
            if (!stringTrim.contains(" ")){
                int tamanio = stringTrim.length();
                suma += tamanio;
            }
        }
        return suma;
    }

}
