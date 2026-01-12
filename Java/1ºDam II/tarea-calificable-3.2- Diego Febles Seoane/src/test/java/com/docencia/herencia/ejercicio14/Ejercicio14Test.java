package com.docencia.herencia.ejercicio14;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
class Ejercicio14Test {

    @Test
    @Order(1)
    void documentoTituloNullDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> new Carta(null));
        assertThrows(IllegalArgumentException.class, () -> new Informe(null, 1));
    }

    @Test
    @Order(2)
    void documentoTituloVacioDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> new Carta("   "));
        assertThrows(IllegalArgumentException.class, () -> new Informe("   ", 2));
    }

    @Test
    @Order(3)
    void informeaginasNoPositivasDebeLanzarExcepcionTest() {
        assertThrows(IllegalArgumentException.class, () -> new Informe("Informe X", 0));
        assertThrows(IllegalArgumentException.class, () -> new Informe("Informe X", -5));
    }

    @Test
    @Order(4)
    void cartaDestinatarioInvalidoDebeLanzarExcepcionTest() {
        var carta = new Carta("Hola");

        assertThrows(IllegalArgumentException.class, () -> carta.setDestinatario(null));
        assertThrows(IllegalArgumentException.class, () -> carta.setDestinatario("   "));
    }

    @Test
    @Order(5)
    void tituloDeNormalizaTest() {
        var carta = new Carta("  Mi carta  ");
        carta.setDestinatario("  Ana  ");

        assertEquals("Mi carta", carta.getTitulo());
        assertEquals("Ana", carta.getDestinatario());
        assertEquals("Carta: Mi carta | Para: Ana", carta.descripcion());
    }


    @Test
    @Order(6)
    void informeDescripcionCorrectaGetPaginasTest() {
        var informe = new Informe("Informe trimestral", 12);

        assertEquals("Informe trimestral", informe.getTitulo());
        assertEquals(12, informe.getPaginas());
        assertEquals("Informe: Informe trimestral (12 páginas)", informe.descripcion());
    }
}
