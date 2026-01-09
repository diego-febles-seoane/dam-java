package com.docencia.listas.ejercicio16;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio16Test {

    @Test
    void sumarLongitudesNoVacias_basico() {
        var lista = Arrays.asList("hola", "  ", null, "adiós");
        int suma = Ejercicio16.sumarLongitudesNoVacias(lista);
        assertEquals("hola".length() + "adiós".length(), suma);
    }

    @Test
    void sumarLongitudesNoVacias_listaNullOVaciaOTodoInvalido() {
        assertEquals(0, Ejercicio16.sumarLongitudesNoVacias(null));
        assertEquals(0, Ejercicio16.sumarLongitudesNoVacias(Collections.emptyList()));
        assertEquals(0, Ejercicio16.sumarLongitudesNoVacias(Arrays.asList(null, "   ")));
    }
}
