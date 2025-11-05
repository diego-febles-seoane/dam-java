package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio17Test {

    @Test
    @Order(1)
    void enrollUntilFull() {
        Ejercicio17 c = new Ejercicio17("Programacion", 2);

        assertTrue(c.enrollStudent("Ana"));
        assertTrue(c.enrollStudent("Luis"));
        assertEquals(2, c.getStudentCount());

        assertFalse(c.enrollStudent("Carla"));
        assertEquals(2, c.getStudentCount());
    }

    @Test
    @Order(2)
    void classroomNameCheck() {
        Ejercicio17 c = new Ejercicio17("Bases de Datos", 3);
        assertEquals("Bases de Datos", c.getClassroomName());
    }
}
