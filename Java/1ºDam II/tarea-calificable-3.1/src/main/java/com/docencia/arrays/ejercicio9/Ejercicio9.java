package com.docencia.arrays.ejercicio9;

public class Ejercicio9 {
    // Devuelve un String uniendo con '-' usando for. Si null o vacío, devuelve "".

    public static String concatenarConGuion(String[] palabras) {
        if (palabras == null || palabras.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < palabras.length; i++) {
            String p = palabras[i];
            sb.append(p == null ? "" : p);
            if (i < palabras.length - 1) {
                sb.append('-');
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Ejercicio9 listo para implementar.");
    }
}
