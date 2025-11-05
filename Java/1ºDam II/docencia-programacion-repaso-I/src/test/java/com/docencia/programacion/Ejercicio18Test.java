package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio18Test {

    @Test
    @Order(1)
    void newRoomIsFree() {
        Ejercicio18 r = new Ejercicio18(305);
        assertEquals(305, r.getRoomNumber());
        assertFalse(r.isOccupied());
    }

    @Test
    @Order(2)
    void occupyAndRelease() {
        Ejercicio18 r = new Ejercicio18(101);
        r.occupy();
        assertTrue(r.isOccupied());

        r.release();
        assertFalse(r.isOccupied());
    }
}
