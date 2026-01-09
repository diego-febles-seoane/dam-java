package com.docencia.clases.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio5Test {
    @Test
    void constructorVacioDebeExistir() {
        Cliente obj = new Cliente();
        assertNotNull(obj);
    }

    @Test
    void constructorConIdDebeAsignarIdentificador() {
        Cliente obj = new Cliente(123);
        assertEquals(123, obj.getId());
    }

    @Test
    void equalsDebeCompararPorIdentificador() {
        Cliente a1 = new Cliente(123);
        Cliente a2 = new Cliente(123);
        Cliente b = new Cliente(999);

        assertEquals(a1, a2, "Dos objetos con el mismo id deben ser iguales");
        assertNotEquals(a1, b, "Dos objetos con distinto id NO deben ser iguales");
    }

    @Test
    void hashCodeDebeSerConsistenteConEquals() {
        Cliente a1 = new Cliente(123);
        Cliente a2 = new Cliente(123);
        assertEquals(a1.hashCode(), a2.hashCode(), "Si equals es true, hashCode debe coincidir");
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Cliente obj = new Cliente(123);
        String txt = obj.toString();
        assertNotNull(txt);
        assertTrue(txt.contains(String.valueOf(123)), "toString debe incluir el identificador único");
    }
}
