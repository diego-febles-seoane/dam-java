package unidad3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio03Test {

    @Test
    void testEvaluarIntento() {
        int secreto = 50;
        assertEquals("Demasiado bajo", Ejercicio03.evaluarIntento(secreto, 10));
        assertEquals("Demasiado alto", Ejercicio03.evaluarIntento(secreto, 90));
        assertEquals("¡Correcto!", Ejercicio03.evaluarIntento(secreto, 50));
    }

    @Test
    void testJugarAcertandoDentroDeIntentos() {
        int secreto = 42;
        int[] intentos = {10, 20, 42, 60};
        assertTrue(Ejercicio03.jugar(secreto, intentos));
    }

    @Test
    void testJugarSinAcertar() {
        int secreto = 42;
        int[] intentos = {1, 2, 3, 4, 5, 6, 7};
        assertFalse(Ejercicio03.jugar(secreto, intentos));
    }

    @Test
    void testJugarConMenosDeSieteIntentos() {
        int secreto = 100;
        int[] intentos = {10, 20, 30};
        assertFalse(Ejercicio03.jugar(secreto, intentos));
    }
}
