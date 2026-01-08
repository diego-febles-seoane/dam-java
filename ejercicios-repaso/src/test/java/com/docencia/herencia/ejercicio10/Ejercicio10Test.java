package com.docencia.herencia.ejercicio10;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio10Test {

    @Test
    void contenidos_contarLargos() {
        Contenido c1 =
                new Ejercicio10.Pelicula("Peli corta", 60);  // no larga
        Contenido c2 =
                new Ejercicio10.Pelicula("Peli larga", 120); // larga
        Contenido c3 =
                new Ejercicio10.Podcast("Podcast corto", 30); // no largo
        Contenido c4 =
                new Ejercicio10.Podcast("Podcast largo", 60); // largo

        int largos = Ejercicio10.contarLargos(Arrays.asList(c1, c2, c3, c4, null));
        assertEquals(2, largos);
    }

    @Test
    void contenidos_listaNullOVacia() {
        assertEquals(0, Ejercicio10.contarLargos(null));
        assertEquals(0, Ejercicio10.contarLargos(Collections.emptyList()));
    }
}
