package com.docencia.composicion.ejercicio11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio11Test {

    @Test
    void clubLectura_basico() {
        var club = new ClubLectura();
        club.registrarLectura(" Ana ", " El Quijote ");
        club.registrarLectura("Luis", "El Quijote");
        club.registrarLectura("Ana", "  Cien años de soledad ");
        club.registrarLectura("   ", "Libro inválido"); // inválida
        club.registrarLectura("Ana", "   ");             // inválida

        assertEquals(2, club.vecesLeido("el quijote"));
        assertEquals(1, club.vecesLeido(" cien años de soledad "));
        assertEquals(0, club.vecesLeido("   "));

        String masLeido = club.libroMasLeido();
        assertEquals("El Quijote", masLeido);
    }

    @Test
    void clubLectura_sinLecturasValidas() {
        var club = new ClubLectura();
        assertNull(club.libroMasLeido());
        assertEquals(0, club.vecesLeido("algo"));
    }
}
