package com.docencia.programacion;

public class Ejercicio21 {
    public static boolean isPalindrome(String text) {
        if (text == null)
            return false;
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        if (cleaned.isEmpty())
            return false;
        int i = 0, j = cleaned.length() - 1;
        while (i < j) {
            if (cleaned.charAt(i) != cleaned.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
