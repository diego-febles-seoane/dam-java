package com.docencia.programacion;

public class Ejercicio24 {
    public static String titleCase(String text) {
        if (text == null || text.trim().isEmpty()) {
            return "";
        }
        text = text.toLowerCase();
        String[] words = text.split("\\s+");
        String resultado = "";
        for (String word : words) {
            String primeraLetra = word.substring(0, 1).toUpperCase();
            String restoPalabra = word.substring(1);
            resultado += primeraLetra + restoPalabra + " ";
        }
        return resultado.trim();
    }
}
