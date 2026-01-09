package com.docencia.condiciones.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio4Test {
    @Test
    void caso1() {
        assertEquals(0.0, Ejercicio4.precioEntrada(3), 0.0001);
    }

    @Test
    void caso2() {
        assertEquals(5.0, Ejercicio4.precioEntrada(10), 0.0001);
    }

    @Test
    void caso3() {
        assertEquals(10.0, Ejercicio4.precioEntrada(30), 0.0001);
    }

    @Test
    void caso4() {
        assertEquals(6.0, Ejercicio4.precioEntrada(70), 0.0001);
    }

}
