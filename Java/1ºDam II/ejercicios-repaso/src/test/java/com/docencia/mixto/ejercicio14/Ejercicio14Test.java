package com.docencia.mixto.ejercicio14;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio14Test {
    @Test
    void equalsDebeCompararPorIdentificador() {
        Articulo a = new Articulo("ID-1", null, 0);
        Articulo b = new Articulo("ID-1", null, 0);
        Articulo c = new Articulo("ID-2", null, 0);
        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    @Test
    void toStringDebeContenerElIdentificador() {
        Articulo a = new Articulo("ID-1", null, 0);
        assertTrue(a.toString().contains(String.valueOf("ID-1")));
    }

    @Test
    void debeResolverElEjercicio() {
        assertEquals(2, Ejercicio14.contarReponer(new Articulo[]{new Articulo("A1","COMIDA",10), new Articulo("A2","OTROS",4), new Articulo("A3","HIGIENE",10)}));
    }
}
