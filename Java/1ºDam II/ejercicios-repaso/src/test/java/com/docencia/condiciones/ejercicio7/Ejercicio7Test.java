package com.docencia.condiciones.ejercicio7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio7Test {
    @Test
    void caso1() {
        assertEquals(true, Ejercicio7.esVocal('a'));
    }

    @Test
    void caso2() {
        assertEquals(false, Ejercicio7.esVocal('B'));
    }

    @Test
    void caso3() {
        assertEquals(true, Ejercicio7.esVocal('U'));
    }

}
