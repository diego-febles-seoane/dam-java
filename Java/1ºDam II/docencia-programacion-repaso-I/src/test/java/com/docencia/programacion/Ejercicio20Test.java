package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio20Test {

    @Test
    @Order(1)
    void initialsEmpty() {
        assertEquals("", Ejercicio20.getInitials(""));
        assertEquals("", Ejercicio20.getInitials(null));
    }

    @Test
    @Order(2)
    void initialsCheck() {
        assertEquals("AL", Ejercicio20.getInitials("Ada Lovelace"));
        assertEquals("JRR", Ejercicio20.getInitials("john ronald reuel"));
    }
}
