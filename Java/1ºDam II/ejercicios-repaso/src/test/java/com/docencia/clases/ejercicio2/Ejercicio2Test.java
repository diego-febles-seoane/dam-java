package com.docencia.clases.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio2Test {
    @Test
    void constructorVacioDebeExistir() {
        Libro obj = new Libro();
        assertNotNull(obj);
    }

    @Test
    void constructorConIdDebeAsignarIdentificador() {
        Libro obj = new Libro("ISBN-123");
        assertEquals("ISBN-123", obj.getIsbn());
    }

    @Test
    void equalsDebeCompararPorIdentificador() {
        Libro a1 = new Libro("ISBN-123");
        Libro a2 = new Libro("ISBN-123");
        Libro b = new Libro("OTRO-999");

        assertEquals(a1, a2, "Dos objetos con el mismo id deben ser iguales");
        assertNotEquals(a1, b, "Dos objetos con distinto id NO deben ser iguales");
    }

    @Test
    void hashCodeDebeSerConsistenteConEquals() {
        Libro a1 = new Libro("ISBN-123");
        Libro a2 = new Libro("ISBN-123");
        assertEquals(a1.hashCode(), a2.hashCode(), "Si equals es true, hashCode debe coincidir");
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Libro obj = new Libro("ISBN-123");
        String txt = obj.toString();
        assertNotNull(txt);
        assertTrue(txt.contains(String.valueOf("ISBN-123")), "toString debe incluir el identificador único");
    }
}
