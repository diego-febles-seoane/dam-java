package com.docencia.programacion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio40Test {

    @Test
    @Order(1)
    void invalidMovesAndNoWinner() {
        Ejercicio40 b = new Ejercicio40();
        assertTrue(b.placeMark(0,0,'O'));
        assertFalse(b.placeMark(0,0,'X'));
        assertFalse(b.placeMark(0,1,'Z'));
        assertEquals(' ', b.checkWinner());
    }

    @Test
    @Order(2)
    void placeAndWinColumn() {
        Ejercicio40 b = new Ejercicio40();
        assertTrue(b.placeMark(0,0,'X'));
        assertTrue(b.placeMark(1,0,'X'));
        assertTrue(b.placeMark(2,0,'X'));
        assertEquals('X', b.checkWinner());
    }
}
