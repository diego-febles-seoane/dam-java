package unidad3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio08Test {

    @Test
    void testPrimos() {
        assertTrue(Ejercicio08.esPrimo(2));
        assertTrue(Ejercicio08.esPrimo(3));
        assertTrue(Ejercicio08.esPrimo(5));
        assertTrue(Ejercicio08.esPrimo(7));
        assertTrue(Ejercicio08.esPrimo(11));
        assertTrue(Ejercicio08.esPrimo(13));
    }

    @Test
    void testNoPrimos() {
        assertFalse(Ejercicio08.esPrimo(4));
        assertFalse(Ejercicio08.esPrimo(6));
        assertFalse(Ejercicio08.esPrimo(8));
        assertFalse(Ejercicio08.esPrimo(9));
        assertFalse(Ejercicio08.esPrimo(10));
    }

    @Test
    void testNumeroInvalidoLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> Ejercicio08.esPrimo(1));
        assertThrows(IllegalArgumentException.class, () -> Ejercicio08.esPrimo(0));
        assertThrows(IllegalArgumentException.class, () -> Ejercicio08.esPrimo(-5));
    }
}
