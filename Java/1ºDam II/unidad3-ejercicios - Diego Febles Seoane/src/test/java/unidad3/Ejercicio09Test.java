package unidad3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio09Test {

    @Test
    void testEstadisticas() {
        int[] datos = {5, 10, 0, -5, 20};

        Ejercicio09.Estadisticas est = Ejercicio09.calcularEstadisticas(datos);

        assertEquals(5, est.getCantidad());
        assertEquals(6.0, est.getMedia(), 0.0001);
        assertEquals(20, est.getMaximo());
        assertEquals(-5, est.getMinimo());
    }

    @Test
    void testArrayVacioLanzaExcepcion() {
        int[] datos = {};
        assertThrows(IllegalArgumentException.class, () -> Ejercicio09.calcularEstadisticas(datos));
    }

    @Test
    void testNullLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> Ejercicio09.calcularEstadisticas(null));
    }
}
