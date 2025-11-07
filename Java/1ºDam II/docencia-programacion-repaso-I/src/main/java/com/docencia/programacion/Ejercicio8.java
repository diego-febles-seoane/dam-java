package com.docencia.programacion;

public class Ejercicio8 {
    public static int safeParseInt(String text) {
        if (text == null || text.isEmpty())
            return 0;
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
