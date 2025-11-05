package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio36Test {

    @Test
    @Order(1)
    void statsCheck() {
        double[] data = {10.0, 12.0, 8.0, 15.5};
        Ejercicio36 ts = new Ejercicio36(data);

        assertEquals(15.5, ts.getMaxTemperature(), 0.0001);
        assertEquals(8.0,  ts.getMinTemperature(), 0.0001);

        double expectedAvg = (10.0 + 12.0 + 8.0 + 15.5) / 4.0;
        assertEquals(expectedAvg, ts.getAverageTemperature(), 0.0001);

        assertEquals(2, ts.countAbove(10.0));
        assertEquals(0, ts.countAbove(20.0));

        data[0] = -100.0;
        assertEquals(15.5, ts.getMaxTemperature(), 0.0001);
    }
}
