package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio19Test {

    @Test
    @Order(1)
    void emptyOrNullCases() {
        assertEquals(0, Ejercicio19.countWords(""));
        assertEquals(0, Ejercicio19.countWords(null));

        assertEquals(0, Ejercicio19.countSpaces(""));
        assertEquals(0, Ejercicio19.countSpaces(null));
    }

    @Test
    @Order(2)
    void normalCases() {
        assertEquals(3, Ejercicio19.countWords("hola que tal"));
        assertEquals(2, Ejercicio19.countWords("  hola   mundo "));

        assertEquals(2, Ejercicio19.countSpaces("a b c"));
    }
}
