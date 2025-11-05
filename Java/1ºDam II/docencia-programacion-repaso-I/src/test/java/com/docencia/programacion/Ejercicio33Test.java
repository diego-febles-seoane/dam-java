package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio33Test {

    @Test
    @Order(1)
    void professorData() {
        Ejercicio33 p = new Ejercicio33("Juan", "Matematicas");
        assertEquals("Juan", p.getName());
        assertEquals("Matematicas", p.getSpecialty());
    }
}
