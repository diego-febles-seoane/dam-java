package com.docencia.listas.ejercicio14;


import java.util.ArrayList;
import java.util.List;


/**
 * Ejercicio 14
 *
 * Clase lanzadora (opcional) y contenedor de métodos del enunciado.
 */

public class Ejercicio14 {

    private Ejercicio14() {
    }

    public static void main(String[] args) {
        // Puedes ejecutar aquí pruebas manuales rápidas si lo deseas.
    }


/**
     * TODO: Implementar completamente según enunciado y tests.
     */
    public static List<String> eliminarDuplicadosPreservandoOrden(List<String> textos) {
        // Implementación provisional: lista vacía si null, copia si no.
        if (textos == null) {
            return new ArrayList<>();
        }
        return new ArrayList<>(textos);
    }

}
