package unidad3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio10Test {

    @Test
    void testCuadrado() {
        String esperado = "***\n***\n***";
        assertEquals(esperado, Ejercicio10.cuadrado(3));
    }

    @Test
    void testTriangulo() {
        String esperado = "*\n**\n***";
        assertEquals(esperado, Ejercicio10.triangulo(3));
    }

    @Test
    void testValorNoValidoLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> Ejercicio10.cuadrado(0));
        assertThrows(IllegalArgumentException.class, () -> Ejercicio10.triangulo(-1));
    }
}
