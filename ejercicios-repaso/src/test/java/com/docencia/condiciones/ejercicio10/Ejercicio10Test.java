package com.docencia.condiciones.ejercicio10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio10Test {
    @Test
    void caso1() {
        assertEquals("PARAR", Ejercicio10.accionSemaforo("ROJO"));
    }

    @Test
    void caso2() {
        assertEquals("PRECAUCION", Ejercicio10.accionSemaforo("AMARILLO"));
    }

    @Test
    void caso3() {
        assertEquals("AVANZAR", Ejercicio10.accionSemaforo("VERDE"));
    }

    @Test
    void caso4() {
        assertEquals("ERROR", Ejercicio10.accionSemaforo("AZUL"));
    }

}
