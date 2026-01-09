package com.docencia.clases.ejercicio7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio7Test {
    @Test
    void constructorVacioDebeExistir() {
        Pelicula obj = new Pelicula();
        assertNotNull(obj);
    }

    @Test
    void constructorConIdDebeAsignarIdentificador() {
        Pelicula obj = new Pelicula("CODIGO-123");
        assertEquals("CODIGO-123", obj.getCodigo());
    }

    @Test
    void equalsDebeCompararPorIdentificador() {
        Pelicula a1 = new Pelicula("CODIGO-123");
        Pelicula a2 = new Pelicula("CODIGO-123");
        Pelicula b = new Pelicula("OTRO-999");

        assertEquals(a1, a2, "Dos objetos con el mismo id deben ser iguales");
        assertNotEquals(a1, b, "Dos objetos con distinto id NO deben ser iguales");
    }

    @Test
    void hashCodeDebeSerConsistenteConEquals() {
        Pelicula a1 = new Pelicula("CODIGO-123");
        Pelicula a2 = new Pelicula("CODIGO-123");
        assertEquals(a1.hashCode(), a2.hashCode(), "Si equals es true, hashCode debe coincidir");
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Pelicula obj = new Pelicula("CODIGO-123");
        String txt = obj.toString();
        assertNotNull(txt);
        assertTrue(txt.contains(String.valueOf("CODIGO-123")), "toString debe incluir el identificador único");
    }
}
