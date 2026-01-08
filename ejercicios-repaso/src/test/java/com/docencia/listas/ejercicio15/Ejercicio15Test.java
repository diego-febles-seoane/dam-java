package com.docencia.listas.ejercicio15;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio15Test {

    @Test
    void buscarPrimeraQueContiene_basico() {
        var lista = Arrays.asList(" Hola mundo ", "Adiós", null, " mUndo pequeño ");
        String r1 = Ejercicio15.buscarPrimeraQueContiene(lista, "MUNDO");
        assertEquals("Hola mundo", r1);
    }

    @Test
    void buscarPrimeraQueContiene_sinCoincidenciasOParametrosInvalidos() {
        var lista = Arrays.asList("Hola", "Adiós");
        assertNull(Ejercicio15.buscarPrimeraQueContiene(lista, "xxx"));
        assertNull(Ejercicio15.buscarPrimeraQueContiene(null, "hola"));
        assertNull(Ejercicio15.buscarPrimeraQueContiene(lista, "   "));
        assertNull(Ejercicio15.buscarPrimeraQueContiene(lista, null));
        assertNull(Ejercicio15.buscarPrimeraQueContiene(Collections.emptyList(), "hola"));
    }
}
