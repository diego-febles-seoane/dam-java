package com.docencia.composicion.ejercicio13;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio13Test {

    @Test
    void biblioteca_basico() {
        var biblio = new Biblioteca();
        biblio.agregarLibro(" El Quijote ", " Cervantes ", 1605);
        biblio.agregarLibro("La Regenta", "Clarín", 1884);
        biblio.agregarLibro("Libro inválido", "   ", 2000); // no válido
        biblio.agregarLibro("Otro inválido", "Autor", -1);  // no válido

        List<Libro> deCervantes =
                biblio.buscarPorAutor(" cervantes ");
        assertEquals(1, deCervantes.size());
        assertEquals("El Quijote", deCervantes.get(0).getTitulo());

        long antiguos = biblio.contarLibrosAnterioresA(1800);
        assertEquals(1L, antiguos);
    }

    @Test
    void biblioteca_sinLibros() {
        var biblio = new Biblioteca();
        assertTrue(biblio.buscarPorAutor("x").isEmpty());
        assertEquals(0L, biblio.contarLibrosAnterioresA(2000));
    }
}
