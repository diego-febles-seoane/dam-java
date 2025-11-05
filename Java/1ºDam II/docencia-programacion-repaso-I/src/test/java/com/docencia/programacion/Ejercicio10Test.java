package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio10Test {

    @Test
    @Order(1)
    void negativeValuesGiveZero() {
        assertEquals(0.0, Ejercicio10.calculateWeeklySalary(-5, 10), 0.0001);
        assertEquals(0.0, Ejercicio10.calculateWeeklySalary(5, -10), 0.0001);
    }

    @Test
    @Order(2)
    void salaryNormalCase() {
        assertEquals(400.0, Ejercicio10.calculateWeeklySalary(40, 10), 0.0001);
    }
}
