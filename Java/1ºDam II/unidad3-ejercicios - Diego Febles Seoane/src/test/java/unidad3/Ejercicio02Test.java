package unidad3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio02Test {

    @Test
    void testSuma() {
        assertEquals(7.0, Ejercicio02.operar(3, 4, 1));
    }

    @Test
    void testResta() {
        assertEquals(-1.0, Ejercicio02.operar(3, 4, 2));
    }

    @Test
    void testMultiplicacion() {
        assertEquals(12.0, Ejercicio02.operar(3, 4, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, Ejercicio02.operar(8, 4, 4));
    }

    @Test
    void testDivisionPorCeroLanzaExcepcion() {
        assertThrows(ArithmeticException.class, () -> Ejercicio02.operar(8, 0, 4));
    }

    @Test
    void testOpcionInvalidaLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> Ejercicio02.operar(1, 2, 99));
    }
}
