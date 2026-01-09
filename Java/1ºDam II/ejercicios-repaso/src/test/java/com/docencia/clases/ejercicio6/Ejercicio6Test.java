package com.docencia.clases.ejercicio6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio6Test {
    @Test
    void constructorVacioDebeExistir() {
        Pedido obj = new Pedido();
        assertNotNull(obj);
    }

    @Test
    void constructorConIdDebeAsignarIdentificador() {
        Pedido obj = new Pedido("CODIGO-123");
        assertEquals("CODIGO-123", obj.getCodigo());
    }

    @Test
    void equalsDebeCompararPorIdentificador() {
        Pedido a1 = new Pedido("CODIGO-123");
        Pedido a2 = new Pedido("CODIGO-123");
        Pedido b = new Pedido("OTRO-999");

        assertEquals(a1, a2, "Dos objetos con el mismo id deben ser iguales");
        assertNotEquals(a1, b, "Dos objetos con distinto id NO deben ser iguales");
    }

    @Test
    void hashCodeDebeSerConsistenteConEquals() {
        Pedido a1 = new Pedido("CODIGO-123");
        Pedido a2 = new Pedido("CODIGO-123");
        assertEquals(a1.hashCode(), a2.hashCode(), "Si equals es true, hashCode debe coincidir");
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Pedido obj = new Pedido("CODIGO-123");
        String txt = obj.toString();
        assertNotNull(txt);
        assertTrue(txt.contains(String.valueOf("CODIGO-123")), "toString debe incluir el identificador único");
    }
}
