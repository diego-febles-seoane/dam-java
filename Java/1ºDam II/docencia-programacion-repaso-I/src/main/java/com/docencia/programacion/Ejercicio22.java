package com.docencia.programacion;

public class Ejercicio22 {
    public static boolean isValidDni(String dni) {
        if (dni == null)
            return false;
        if (dni.length() != 9)
            return false;
        String number = dni.substring(0, 8);
        char letter = dni.charAt(8);
        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(number.charAt(i)))
                return false;
        }
        if (!Character.isUpperCase(letter))
            return false;
        return true;
    }
}
