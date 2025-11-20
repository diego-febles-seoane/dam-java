package unidad3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio05Test {

    @Test
    void testTablaMultiplicar() {
        int[] tabla = Ejercicio05.tablaMultiplicar(3);

        assertEquals(10, tabla.length);
        assertArrayEquals(new int[]{3, 6, 9, 12, 15, 18, 21, 24, 27, 30}, tabla);
    }

    @Test
    void testSumaTabla() {
        // Para n=3, suma = 3*(1+2+...+10) = 3*55 = 165
        assertEquals(165, Ejercicio05.sumaTabla(3));
    }
}
