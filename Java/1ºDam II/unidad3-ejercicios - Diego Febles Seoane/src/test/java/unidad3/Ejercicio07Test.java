package unidad3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio07Test {

    @Test
    void testParesImparesRangoNormal() {
        Ejercicio07.ParesImpares resultado = Ejercicio07.calcularParesImpares(1, 5);

        assertEquals(java.util.List.of(2, 4), resultado.getPares());
        assertEquals(java.util.List.of(1, 3, 5), resultado.getImpares());
    }

    @Test
    void testParesImparesConIntercambio() {
        // a > b, el método debe intercambiarlos
        Ejercicio07.ParesImpares resultado = Ejercicio07.calcularParesImpares(5, 1);

        assertEquals(java.util.List.of(2, 4), resultado.getPares());
        assertEquals(java.util.List.of(1, 3, 5), resultado.getImpares());
    }

    @Test
    void testRangoUnSoloNumeroPar() {
        Ejercicio07.ParesImpares resultado = Ejercicio07.calcularParesImpares(2, 2);

        assertEquals(java.util.List.of(2), resultado.getPares());
        assertEquals(java.util.List.of(), resultado.getImpares());
    }

    @Test
    void testRangoUnSoloNumeroImpar() {
        Ejercicio07.ParesImpares resultado = Ejercicio07.calcularParesImpares(3, 3);

        assertEquals(java.util.List.of(), resultado.getPares());
        assertEquals(java.util.List.of(3), resultado.getImpares());
    }
}
