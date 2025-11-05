package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio37Test {

    @Test
    @Order(1)
    void hotelManagerFlow() {
        Ejercicio18 r1 = new Ejercicio18(101);
        Ejercicio18 r2 = new Ejercicio18(102);
        Ejercicio37 m = new Ejercicio37(new Ejercicio18[]{r1, r2});

        assertEquals(101, m.findFirstFreeRoomNumber());

        assertTrue(m.checkIn(101));
        assertFalse(m.checkIn(101));
        assertEquals(102, m.findFirstFreeRoomNumber());

        assertTrue(m.checkOut(101));
        assertFalse(m.checkOut(101));
        assertEquals(101, m.findFirstFreeRoomNumber());

        assertFalse(m.checkIn(999));
    }
}
