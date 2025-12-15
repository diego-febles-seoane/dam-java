package com.docencia.herencia.ejercicio7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio7Test {

    @Test
    void personas_descripciones() {
        var p1 = new Ejercicio7.Estudiante("Ana", "1º ESO");
        var p2 = new Ejercicio7.Profesor("Luis", "Matemáticas");

        var res = Ejercicio7.descripciones(Arrays.asList(p1, null, p2));
        assertEquals(Arrays.asList(
                "Estudiante Ana de 1º ESO",
                "Profesor Luis de Matemáticas"
        ), res);
    }

    @Test
    void descripciones_listaNullOVacia() {
        assertTrue(Ejercicio7.descripciones(null).isEmpty());
        assertTrue(Ejercicio7.descripciones(Collections.emptyList()).isEmpty());
    }
}
