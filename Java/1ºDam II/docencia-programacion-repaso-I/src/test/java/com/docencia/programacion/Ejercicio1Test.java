package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio1Test {

    @Test
    @Order(1)
    void helloMessageIsCorrect() {
        assertEquals("Hola, mundo.", Ejercicio1.getHello());
    }
}
