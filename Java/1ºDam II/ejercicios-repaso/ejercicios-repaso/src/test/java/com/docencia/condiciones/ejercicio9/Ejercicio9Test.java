package com.docencia.condiciones.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio9Test {
    @Test
    void caso1() {
        assertEquals("BAJO", Ejercicio9.categoriaIMC(17.0));
    }

    @Test
    void caso2() {
        assertEquals("NORMAL", Ejercicio9.categoriaIMC(22.0));
    }

    @Test
    void caso3() {
        assertEquals("SOBREPESO", Ejercicio9.categoriaIMC(27.0));
    }

    @Test
    void caso4() {
        assertEquals("OBESIDAD", Ejercicio9.categoriaIMC(31.0));
    }

}
