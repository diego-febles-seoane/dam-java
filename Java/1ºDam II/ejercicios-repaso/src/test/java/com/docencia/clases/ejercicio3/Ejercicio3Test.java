package com.docencia.clases.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio3Test {
    @Test
    void constructorVacioDebeExistir() {
        Coche obj = new Coche();
        assertNotNull(obj);
    }

    @Test
    void constructorConIdDebeAsignarIdentificador() {
        Coche obj = new Coche("MATRICULA-123");
        assertEquals("MATRICULA-123", obj.getMatricula());
    }

    @Test
    void equalsDebeCompararPorIdentificador() {
        Coche a1 = new Coche("MATRICULA-123");
        Coche a2 = new Coche("MATRICULA-123");
        Coche b = new Coche("OTRO-999");

        assertEquals(a1, a2, "Dos objetos con el mismo id deben ser iguales");
        assertNotEquals(a1, b, "Dos objetos con distinto id NO deben ser iguales");
    }

    @Test
    void hashCodeDebeSerConsistenteConEquals() {
        Coche a1 = new Coche("MATRICULA-123");
        Coche a2 = new Coche("MATRICULA-123");
        assertEquals(a1.hashCode(), a2.hashCode(), "Si equals es true, hashCode debe coincidir");
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Coche obj = new Coche("MATRICULA-123");
        String txt = obj.toString();
        assertNotNull(txt);
        assertTrue(txt.contains(String.valueOf("MATRICULA-123")), "toString debe incluir el identificador único");
    }
}
