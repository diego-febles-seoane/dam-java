package com.docencia.programacion;

public class Ejercicio7 {
    public static int lengthSafe(String text) {
        if (text == null || text.isEmpty())
            return 0;
        return text.length();
    }

    public static String toUpperSafe(String text) {
        if (text == null || text.isEmpty())
            return "";
        return text.toUpperCase();
    }

    public static char firstCharOrNullChar(String text) {
        if (text == null || text.isEmpty())
            return '\0';
        return text.charAt(0);
    }
}
