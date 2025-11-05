package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio34Test {

    @Test
    @Order(1)
    void tutorAndEnrollment() {
        Ejercicio34 c = new Ejercicio34(2);

        assertEquals("", c.getTutorName());

        Ejercicio33 prof = new Ejercicio33("Eva", "Fisica");
        c.assignTutor(prof);
        assertEquals("Eva", c.getTutorName());

        Ejercicio15 s1 = new Ejercicio15("Ana", 20);
        Ejercicio15 s2 = new Ejercicio15("Luis", 19);
        Ejercicio15 s3 = new Ejercicio15("Carlos", 21);

        assertTrue(c.enrollStudent(s1));
        assertTrue(c.enrollStudent(s2));
        assertFalse(c.enrollStudent(s3));

        assertEquals(2, c.getStudentCount());
    }
}
