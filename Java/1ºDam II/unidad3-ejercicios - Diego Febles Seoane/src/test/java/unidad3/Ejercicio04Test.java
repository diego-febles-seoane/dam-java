package unidad3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio04Test {

    @Test
    void testContarSignos() {
        int[] datos = {1, -2, 0, 3, 0, -5};
        Ejercicio04.ContadorSignos contador = Ejercicio04.contarSignos(datos);

        assertEquals(2, contador.getPositivos());
        assertEquals(2, contador.getNegativos());
        assertEquals(2, contador.getCeros());
    }

    @Test
    void testArrayVacio() {
        int[] datos = {};
        Ejercicio04.ContadorSignos contador = Ejercicio04.contarSignos(datos);

        assertEquals(0, contador.getPositivos());
        assertEquals(0, contador.getNegativos());
        assertEquals(0, contador.getCeros());
    }

    @Test
    void testNull() {
        Ejercicio04.ContadorSignos contador = Ejercicio04.contarSignos(null);

        assertEquals(0, contador.getPositivos());
        assertEquals(0, contador.getNegativos());
        assertEquals(0, contador.getCeros());
    }
}
