package com.docencia.clases.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio1Test {
    @Test
    void constructorVacioDebeExistir() {
        Persona obj = new Persona();
        assertNotNull(obj);
    }

    @Test
    void constructorConIdDebeAsignarIdentificador() {
        Persona obj = new Persona("DNI-123");
        assertEquals("DNI-123", obj.getDni());
    }

    @Test
    void equalsDebeCompararPorIdentificador() {
        Persona a1 = new Persona("DNI-123");
        Persona a2 = new Persona("DNI-123");
        Persona b = new Persona("OTRO-999");

        assertEquals(a1, a2, "Dos objetos con el mismo id deben ser iguales");
        assertNotEquals(a1, b, "Dos objetos con distinto id NO deben ser iguales");
    }

    @Test
    void hashCodeDebeSerConsistenteConEquals() {
        Persona a1 = new Persona("DNI-123");
        Persona a2 = new Persona("DNI-123");
        assertEquals(a1.hashCode(), a2.hashCode(), "Si equals es true, hashCode debe coincidir");
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Persona obj = new Persona("DNI-123");
        String txt = obj.toString();
        assertNotNull(txt);
        assertTrue(txt.contains(String.valueOf("DNI-123")), "toString debe incluir el identificador único");
    }
}
