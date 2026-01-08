package com.docencia.listas.ejercicio4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio4Test {

    @Test
    void mediaValoresValidos_basico() {
        double media = Ejercicio4.mediaValoresValidos(
                Arrays.asList(1, null, 3, 5)
        );
        assertEquals(3.0, media, 0.0001);
    }

    @Test
    void mediaValoresValidos_listaNullOVaciaOTodoNull() {
        assertEquals(0.0, Ejercicio4.mediaValoresValidos(null), 0.0001);
        assertEquals(0.0, Ejercicio4.mediaValoresValidos(Collections.emptyList()), 0.0001);
        assertEquals(0.0, Ejercicio4.mediaValoresValidos(Arrays.asList(null, null)), 0.0001);
    }
}
