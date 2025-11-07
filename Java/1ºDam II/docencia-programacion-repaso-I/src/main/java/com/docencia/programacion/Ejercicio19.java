package com.docencia.programacion;

public class Ejercicio19 {
    public static int countWords(String text) {
        if (text == null)
            return 0;
        String trimmed = text.trim();
        if (trimmed.isEmpty())
            return 0;
        String[] parts = trimmed.split("\\s+");
        return parts.length;
    }

    public static int countSpaces(String text) {
        if (text == null || text.isEmpty())
            return 0;
        int c = 0;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == ' ')
                c++;
        return c;
    }
}
