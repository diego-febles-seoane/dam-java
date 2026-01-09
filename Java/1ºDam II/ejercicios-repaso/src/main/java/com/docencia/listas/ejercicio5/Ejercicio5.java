package com.docencia.listas.ejercicio5;


import java.util.ArrayList;
import java.util.List;


/**
 * Ejercicio 5
 *
 * Clase lanzadora (opcional) y contenedor de métodos del enunciado.
 */

public class Ejercicio5 {

    private Ejercicio5() {
    }

    public static void main(String[] args) {
        // Puedes ejecutar aquí pruebas manuales rápidas si lo deseas.
    }


/**
     * TODO: Implementar completamente según enunciado y tests.
     */
    public static List<String> normalizarNombres(List<String> nombres) {
        if (nombres == null || nombres.isEmpty()){
            return new ArrayList<>();
        }
        List<String> resultado = new ArrayList<>();
        for (String nombre : nombres) {
            String normaliado = "";


            resultado.add(normaliado);
        }
        return new ArrayList<>();
    }

}
