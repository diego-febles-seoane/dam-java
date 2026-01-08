package com.docencia.clases.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio9Test {
    @Test
    void constructorVacioDebeExistir() {
        Curso obj = new Curso();
        assertNotNull(obj);
    }

    @Test
    void constructorConIdDebeAsignarIdentificador() {
        Curso obj = new Curso("CODIGO-123");
        assertEquals("CODIGO-123", obj.getCodigo());
    }

    @Test
    void equalsDebeCompararPorIdentificador() {
        Curso a1 = new Curso("CODIGO-123");
        Curso a2 = new Curso("CODIGO-123");
        Curso b = new Curso("OTRO-999");

        assertEquals(a1, a2, "Dos objetos con el mismo id deben ser iguales");
        assertNotEquals(a1, b, "Dos objetos con distinto id NO deben ser iguales");
    }

    @Test
    void hashCodeDebeSerConsistenteConEquals() {
        Curso a1 = new Curso("CODIGO-123");
        Curso a2 = new Curso("CODIGO-123");
        assertEquals(a1.hashCode(), a2.hashCode(), "Si equals es true, hashCode debe coincidir");
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Curso obj = new Curso("CODIGO-123");
        String txt = obj.toString();
        assertNotNull(txt);
        assertTrue(txt.contains(String.valueOf("CODIGO-123")), "toString debe incluir el identificador único");
    }
}
