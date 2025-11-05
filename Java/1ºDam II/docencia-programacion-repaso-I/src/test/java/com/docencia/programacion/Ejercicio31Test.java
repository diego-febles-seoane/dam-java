package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio31Test {

    @Test
    @Order(1)
    void gradesAndAverage() {
        String[] names = {"Ana","Luis","Marta"};
        double[] grades = {7.5, 8.0, 10.0};

        Ejercicio31 g = new Ejercicio31(names, grades);

        assertEquals(7.5, g.getGrade("Ana"), 0.0001);
        assertEquals(10.0, g.getGrade("Marta"), 0.0001);
        assertEquals(-1.0, g.getGrade("NoExiste"), 0.0001);

        double expectedAverage = (7.5+8.0+10.0)/3.0;
        assertEquals(expectedAverage, g.calculateAverageGrade(), 0.0001);
    }
}
