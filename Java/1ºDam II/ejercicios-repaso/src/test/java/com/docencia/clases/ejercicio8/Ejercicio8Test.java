package com.docencia.clases.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio8Test {
    @Test
    void constructorVacioDebeExistir() {
        Usuario obj = new Usuario();
        assertNotNull(obj);
    }

    @Test
    void constructorConIdDebeAsignarIdentificador() {
        Usuario obj = new Usuario("USERNAME-123");
        assertEquals("USERNAME-123", obj.getUsername());
    }

    @Test
    void equalsDebeCompararPorIdentificador() {
        Usuario a1 = new Usuario("USERNAME-123");
        Usuario a2 = new Usuario("USERNAME-123");
        Usuario b = new Usuario("OTRO-999");

        assertEquals(a1, a2, "Dos objetos con el mismo id deben ser iguales");
        assertNotEquals(a1, b, "Dos objetos con distinto id NO deben ser iguales");
    }

    @Test
    void hashCodeDebeSerConsistenteConEquals() {
        Usuario a1 = new Usuario("USERNAME-123");
        Usuario a2 = new Usuario("USERNAME-123");
        assertEquals(a1.hashCode(), a2.hashCode(), "Si equals es true, hashCode debe coincidir");
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Usuario obj = new Usuario("USERNAME-123");
        String txt = obj.toString();
        assertNotNull(txt);
        assertTrue(txt.contains(String.valueOf("USERNAME-123")), "toString debe incluir el identificador único");
    }
}
