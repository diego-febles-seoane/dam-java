package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio21Test {

    @Test
    @Order(1)
    void palindromeFalseCases() {
        assertFalse(Ejercicio21.isPalindrome(null));
        assertFalse(Ejercicio21.isPalindrome("hola"));
    }

    @Test
    @Order(2)
    void palindromeTrueCases() {
        assertTrue(Ejercicio21.isPalindrome("Neuquen"));
        assertTrue(Ejercicio21.isPalindrome("anita lava la tina"));
        assertTrue(Ejercicio21.isPalindrome("AA"));
        assertTrue(Ejercicio21.isPalindrome("a"));
    }
}
