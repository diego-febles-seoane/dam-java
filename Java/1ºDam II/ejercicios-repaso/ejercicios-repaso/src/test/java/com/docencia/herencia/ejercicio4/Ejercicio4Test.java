package com.docencia.herencia.ejercicio4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio4Test {

    @Test
    void contarRecientes_basico() {
        Publicacion p1 =
                new Ejercicio4.LibroPublicacion("Libro antiguo", 2000);
        Publicacion p2 =
                new Ejercicio4.LibroPublicacion("Libro reciente", 2021);
        Publicacion p3 =
                new Ejercicio4.ArticuloPublicacion("Artículo muy reciente", 2023);
        Publicacion p4 =
                new Ejercicio4.ArticuloPublicacion("Artículo antiguo", 2010);

        int recientes = Ejercicio4.contarRecientes(
                Arrays.asList(p1, p2, p3, p4, null),
                2024
        );
        // Libro reciente: 2021 -> 3 años -> <=5 => reciente
        // Artículo muy reciente: 2023 -> 1 año -> <=2 => reciente
        assertEquals(2, recientes);
    }

    @Test
    void contarRecientes_listaNull() {
        assertEquals(0, Ejercicio4.contarRecientes(null, 2024));
    }
}
