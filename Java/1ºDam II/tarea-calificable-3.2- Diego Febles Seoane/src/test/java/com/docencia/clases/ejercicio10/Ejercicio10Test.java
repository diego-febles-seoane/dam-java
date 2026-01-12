package com.docencia.clases.ejercicio10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio10Test {

    @Test
    @Order(1)
    void constructorVacioDebeExistir() {
        Mascota obj = new Mascota();
        assertNotNull(obj);
    }

    @Test
    @Order(2)
    void constructorConIdDebeAsignarIdentificador() {
        Mascota obj = new Mascota("CHIP-123");
        assertEquals("CHIP-123", obj.getChip());
    }

    @Test
    @Order(3)
    void equalsDebeCompararPorIdentificador() {
        Mascota a1 = new Mascota("CHIP-123");
        Mascota a2 = new Mascota("CHIP-123");
        Mascota b = new Mascota("OTRO-999");

        assertEquals(a1, a2, "Dos objetos con el mismo id deben ser iguales");
        assertNotEquals(a1, b, "Dos objetos con distinto id NO deben ser iguales");
    }

    @Test
    @Order(4)
    void hashCodeDebeSerConsistenteConEquals() {
        Mascota a1 = new Mascota("CHIP-123");
        Mascota a2 = new Mascota("CHIP-123");
        assertEquals(a1.hashCode(), a2.hashCode(), "Si equals es true, hashCode debe coincidir");
    }

    @Test
    @Order(5)
    void toStringDebeContenerElIdentificador() {
        Mascota obj = new Mascota("CHIP-123");
        String txt = obj.toString();

        assertNotNull(txt);
        assertTrue(txt.contains("CHIP-123"), "toString debe incluir el identificador único");
    }
}
