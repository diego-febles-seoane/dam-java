package com.docencia.herencia.ejercicio14;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio14Test {

    @Test
    void documentos_descripciones() {
        Documento d1 =
                new Ejercicio14.Informe("Informe ventas", 10);
        Documento d2 =
                new Ejercicio14.Carta("Carta presentación", "Ana");

        assertEquals("Informe 'Informe ventas' de 10 páginas", d1.descripcion());
        assertEquals("Carta 'Carta presentación' para Ana", d2.descripcion());

        var lista = Ejercicio14.descripciones(Arrays.asList(d1, null, d2));
        assertEquals(Arrays.asList(
                "Informe 'Informe ventas' de 10 páginas",
                "Carta 'Carta presentación' para Ana"
        ), lista);
    }

    @Test
    void documentos_listaNullOVacia() {
        assertTrue(Ejercicio14.descripciones(null).isEmpty());
        assertTrue(Ejercicio14.descripciones(Collections.emptyList()).isEmpty());
    }
}
