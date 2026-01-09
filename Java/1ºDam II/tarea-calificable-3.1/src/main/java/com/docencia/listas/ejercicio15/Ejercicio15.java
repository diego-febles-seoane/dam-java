package com.docencia.listas.ejercicio15;

import java.util.List;

/**
 * Ejercicio 15
 *
 * Clase lanzadora (opcional) y contenedor de métodos del enunciado.
 */

public class Ejercicio15 {

    private Ejercicio15() {
    }

    public static void main(String[] args) {
        // Puedes ejecutar aquí pruebas manuales rápidas si lo deseas.
    }

    /**
     * TODO: Implementar completamente según enunciado y tests.
     */
    public static String buscarPrimeraQueContiene(List<String> textos, String fragmento) {
        if (textos == null || fragmento == null)
            return null;
        String frag = fragmento.trim();
        if (frag.isEmpty())
            return null;
        String fragLower = frag.toLowerCase();
        for (String s : textos) {
            if (s == null)
                continue;
            String trimmed = s.trim();
            if (trimmed.toLowerCase().contains(fragLower)) {
                return trimmed;
            }
        }
        return null;
    }

}
