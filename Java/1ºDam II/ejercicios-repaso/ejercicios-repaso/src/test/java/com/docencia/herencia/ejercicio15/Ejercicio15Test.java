package com.docencia.herencia.ejercicio15;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio15Test {

    @Test
    void cursos_contarIntensos() {
        Curso c1 =
                new CursoOnline("Java básico", 20, "Plataforma A");
        Curso c2 =
                new CursoOnline("Java avanzado", 40, "Plataforma B");
        Curso c3 =
                new CursoPresencial("Spring", 60, "Aula 1");

        assertFalse(c1.esIntenso());
        assertTrue(c2.esIntenso());
        assertTrue(c3.esIntenso());

        int intensos = CursoPresencial.contarIntensos(Arrays.asList(c1, c2, c3, null));
        assertEquals(2, intensos);
    }

    @Test
    void cursos_listaNullOVacia() {
        assertEquals(0, CursoPresencial.contarIntensos(null));
        assertEquals(0, CursoPresencial.contarIntensos(Collections.emptyList()));
    }
}
