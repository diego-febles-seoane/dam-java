package com.docencia.listas.ejercicio6;


import java.util.List;


/**
 * Ejercicio 6
 *
 * Clase lanzadora (opcional) y contenedor de métodos del enunciado.
 */

public class Ejercicio6 {

    private Ejercicio6() {
    }

    public static void main(String[] args) {
        // Puedes ejecutar aquí pruebas manuales rápidas si lo deseas.
    }


/**
     * TODO: Implementar completamente según enunciado y tests.
     */
    public static int contarOcurrencias(List<String> textos, String objetivo) {
        if (textos == null || textos.isEmpty() || objetivo == null || objetivo.isBlank()) {
            return 0;
        }
        int resultado = 0;
        for (String palabra : textos){
            if (palabra != null && palabra.trim().toLowerCase().equals(objetivo.trim().toLowerCase())){
                resultado++;
            }
        }
        return resultado;
    }

}
