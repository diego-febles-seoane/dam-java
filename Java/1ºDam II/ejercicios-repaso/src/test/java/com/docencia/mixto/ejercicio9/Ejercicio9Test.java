package com.docencia.mixto.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio9Test {
    @Test
    void equalsDebeCompararPorIdentificador() {
        LecturaSensor a = new LecturaSensor("ID-1", null, 0);
        LecturaSensor b = new LecturaSensor("ID-1", null, 0);
        LecturaSensor c = new LecturaSensor("ID-2", null, 0);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        LecturaSensor a = new LecturaSensor("ID-1", null, 0);
        assertTrue(a.toString().contains(String.valueOf("ID-1")));
    }

    @Test
    void debeResolverElEjercicio() {
        assertEquals(true, Ejercicio9.hayAlerta(new LecturaSensor[]{new LecturaSensor("S1","TEMP",36.0), new LecturaSensor("S2","CO2",1200.0)}));
    }
}
