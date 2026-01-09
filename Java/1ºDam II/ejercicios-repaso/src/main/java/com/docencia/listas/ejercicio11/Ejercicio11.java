package com.docencia.listas.ejercicio11;


import java.util.ArrayList;
import java.util.List;


/**
 * Ejercicio 11
 *
 * Clase lanzadora (opcional) y contenedor de métodos del enunciado.
 */

public class Ejercicio11 {

    private Ejercicio11() {
    }

    public static void main(String[] args) {
        // Puedes ejecutar aquí pruebas manuales rápidas si lo deseas.
    }


/**
     * TODO: Implementar completamente según enunciado y tests.
     */
    public static List<Integer> ordenarDescSinNulls(List<Integer> numeros) {
        // Implementación provisional: lista vacía para null, o copia sin ordenar.
        if (numeros == null) {
            return new ArrayList<>();
        }
        return new ArrayList<>(numeros);
    }

}
