package com.docencia.clases.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio4Test {
    @Test
    void constructorVacioDebeExistir() {
        CuentaBancaria obj = new CuentaBancaria();
        assertNotNull(obj);
    }

    @Test
    void constructorConIdDebeAsignarIdentificador() {
        CuentaBancaria obj = new CuentaBancaria("IBAN-123");
        assertEquals("IBAN-123", obj.getIban());
    }

    @Test
    void equalsDebeCompararPorIdentificador() {
        CuentaBancaria a1 = new CuentaBancaria("IBAN-123");
        CuentaBancaria a2 = new CuentaBancaria("IBAN-123");
        CuentaBancaria b = new CuentaBancaria("OTRO-999");

        assertEquals(a1, a2, "Dos objetos con el mismo id deben ser iguales");
        assertNotEquals(a1, b, "Dos objetos con distinto id NO deben ser iguales");
    }

    @Test
    void hashCodeDebeSerConsistenteConEquals() {
        CuentaBancaria a1 = new CuentaBancaria("IBAN-123");
        CuentaBancaria a2 = new CuentaBancaria("IBAN-123");
        assertEquals(a1.hashCode(), a2.hashCode(), "Si equals es true, hashCode debe coincidir");
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        CuentaBancaria obj = new CuentaBancaria("IBAN-123");
        String txt = obj.toString();
        assertNotNull(txt);
        assertTrue(txt.contains(String.valueOf("IBAN-123")), "toString debe incluir el identificador único");
    }
}
