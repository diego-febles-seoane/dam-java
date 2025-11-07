package com.docencia.programacion;

public class Ejercicio20 {
    public static String getInitials(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) {
            return "";
        }
        String[] names = fullName.trim().split("\\s+");
        String initials = "";
        for (String name : names) {
            initials += name.charAt(0);
        }
        return initials.toUpperCase();
    }
}
