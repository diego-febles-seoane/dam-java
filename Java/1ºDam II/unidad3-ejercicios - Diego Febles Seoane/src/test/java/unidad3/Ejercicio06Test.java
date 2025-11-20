package unidad3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio06Test {

    @Test
    void testFactorialValoresBasicos() {
        assertEquals(1, Ejercicio06.factorial(0));
        assertEquals(1, Ejercicio06.factorial(1));
        assertEquals(2, Ejercicio06.factorial(2));
        assertEquals(6, Ejercicio06.factorial(3));
        assertEquals(24, Ejercicio06.factorial(4));
        assertEquals(120, Ejercicio06.factorial(5));
    }

    @Test
    void testFactorialNegativoLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> Ejercicio06.factorial(-1));
    }

    @Test
    void testFactorialDemasiadoGrandeLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> Ejercicio06.factorial(21));
    }
}
