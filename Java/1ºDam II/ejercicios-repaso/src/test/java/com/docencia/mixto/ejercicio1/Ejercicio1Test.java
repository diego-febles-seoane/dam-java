package com.docencia.mixto.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio1Test {
    @Test
    void equalsDebeCompararPorIdentificador() {
        Producto a = new Producto("ID-1", null, 0);
        Producto b = new Producto("ID-1", null, 0);
        Producto c = new Producto("ID-2", null, 0);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Producto a = new Producto("ID-1", null, 0);
        assertTrue(a.toString().contains(String.valueOf("ID-1")));
    }

    @Test
    void debeResolverElEjercicio() {
        assertEquals(36.0, Ejercicio1.totalConDescuentoPorCategoria(new Producto[]{new Producto("P1","A",10.0), new Producto("P2","B",20.0), new Producto("P3","A",30.0)}, "A", 5), 0.0001);
    }
}
