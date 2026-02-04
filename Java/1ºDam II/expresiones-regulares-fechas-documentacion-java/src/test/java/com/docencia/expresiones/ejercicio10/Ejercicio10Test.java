package com.docencia.expresiones.ejercicio10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Ejercicio10Test {

    @Test
    @DisplayName("Válido: 00000000T")
    void valido_00000000T() {
        assertTrue(Ejercicio10.validarDNI("00000000T"));
    }

    @Test
    @DisplayName("Válido: 12345678Z")
    void valido_12345678Z() {
        assertTrue(Ejercicio10.validarDNI("12345678Z"));
    }

    @Test
    @DisplayName("Inválido: 53077918Y")
    void valido_53077918Y() {
        assertFalse(Ejercicio10.validarDNI("53077918Y"));
    }


    @Test
    @DisplayName("Inválido: null")
    void invalido_null() {
        assertFalse(Ejercicio10.validarDNI(null));
    }

    @Test
    @DisplayName("Inválido: cadena vacía")
    void invalido_vacio() {
        assertFalse(Ejercicio10.validarDNI(""));
    }

    @Test
    @DisplayName("Inválido: solo espacios")
    void invalido_espacios() {
        assertFalse(Ejercicio10.validarDNI("   "));
    }

    // ===== INVÁLIDOS: FORMATO INCORRECTO =====

    @Test
    @DisplayName("Inválido formato: 7 dígitos (1234567Z)")
    void invalido_formato_7digitos() {
        assertFalse(Ejercicio10.validarDNI("1234567Z"));
    }

    @Test
    @DisplayName("Inválido formato: 9 dígitos (123456789Z)")
    void invalido_formato_9digitos() {
        assertFalse(Ejercicio10.validarDNI("123456789Z"));
    }

    @Test
    @DisplayName("Inválido formato: letra minúscula (12345678z)")
    void invalido_formato_minuscula() {
        assertFalse(Ejercicio10.validarDNI("12345678z"));
    }

    @Test
    @DisplayName("Inválido formato: separadores (12.345.678Z)")
    void invalido_formato_separadores() {
        assertFalse(Ejercicio10.validarDNI("12.345.678Z"));
    }

    @Test
    @DisplayName("Inválido formato: no son 8 dígitos (1234A678Z)")
    void invalido_formato_no8digitos() {
        assertFalse(Ejercicio10.validarDNI("1234A678Z"));
    }

    @Test
    @DisplayName("Inválido formato: guion (12345678-Z)")
    void invalido_formato_guion() {
        assertFalse(Ejercicio10.validarDNI("12345678-Z"));
    }

    @Test
    @DisplayName("Inválido formato: empieza con letra (A2345678Z)")
    void invalido_formato_empiezaLetra() {
        assertFalse(Ejercicio10.validarDNI("A2345678Z"));
    }

    @Test
    @DisplayName("Inválido formato: falta letra (12345678)")
    void invalido_formato_sinLetra() {
        assertFalse(Ejercicio10.validarDNI("12345678"));
    }

    @Test
    @DisplayName("Inválido formato: sobran caracteres (12345678ZZ)")
    void invalido_formato_sobranChars() {
        assertFalse(Ejercicio10.validarDNI("12345678ZZ"));
    }

    // ===== INVÁLIDOS: LETRA INCORRECTA (FORMATO OK) =====

    @Test
    @DisplayName("Inválido letra: 12345678A (debería ser Z)")
    void invalido_letra_12345678A() {
        assertFalse(Ejercicio10.validarDNI("12345678A"));
    }

    @Test
    @DisplayName("Inválido letra: 00000000A (debería ser T)")
    void invalido_letra_00000000A() {
        assertFalse(Ejercicio10.validarDNI("00000000A"));
    }

    @Test
    @DisplayName("Inválido letra: 53077918A (debería ser Y)")
    void invalido_letra_53077918A() {
        assertFalse(Ejercicio10.validarDNI("53077918A"));
    }

    // ===== CASO LÍMITE CON 99999999 (UNO VÁLIDO Y UNO INVÁLIDO) =====

    @Test
    @DisplayName("Válido: 99999999 + letra correcta")
    void valido_99999999_conLetraCorrecta() {
        String tabla = "TRWAGMYFPDXBNJZSQVHLCKE";
        int num = 99999999;
        char letraEsperada = tabla.charAt(num % 23);
        String dni = String.format("%08d%c", num, letraEsperada);

        assertTrue(Ejercicio10.validarDNI(dni));
    }

    @Test
    @DisplayName("Inválido: 99999999 + letra incorrecta")
    void invalido_99999999_conLetraIncorrecta() {
        String tabla = "TRWAGMYFPDXBNJZSQVHLCKE";
        int num = 99999999;
        char letraEsperada = tabla.charAt(num % 23);

        // elegimos una letra distinta seguro
        char letraMala = (letraEsperada == 'A') ? 'B' : 'A';
        String dni = String.format("%08d%c", num, letraMala);

        assertFalse(Ejercicio10.validarDNI(dni));
    }
}

