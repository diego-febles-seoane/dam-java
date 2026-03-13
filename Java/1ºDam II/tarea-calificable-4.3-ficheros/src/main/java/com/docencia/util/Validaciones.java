package com.docencia.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {
    public static String normalizarEmail(String email) {
        if (email == null || email.isBlank()) {
            return null;
        }
        return email.trim().toLowerCase();
    }

    public static boolean emailValido(String email) {
        email = normalizarEmail(email);
        if (email == null) {
            return false;
        }
        return email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$");
        
    } 

    public static boolean passwordValida(String password) {
        return true;
    }

    public static void validarNombre(String nombre) {
        return;
    }

    public static void validarPassword(String password) {
        return;
    }
}
