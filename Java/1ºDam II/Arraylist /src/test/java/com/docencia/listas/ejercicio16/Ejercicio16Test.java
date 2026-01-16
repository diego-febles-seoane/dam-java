package com.docencia.listas.ejercicio16;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
class Ejercicio16Test {


    @Test
    @Order(1)
    void listaNullDevuelveCero() {
        assertEquals(0, Ejercicio16.sumarLongitudesNoVacias(null));
    }

    @Test
    @Order(2)
    void listaVaciaDevuelveCero() {
        assertEquals(0, Ejercicio16.sumarLongitudesNoVacias(Collections.emptyList()));
    }

    @Test
    @Order(3)
    void listaConTodoInvalidoDevuelveCero() {
        assertEquals(0, Ejercicio16.sumarLongitudesNoVacias(Arrays.asList(null, "   ")));
    }

    @Test
    @Order(4)
    void sumarLongitudesNoVaciasUno() {
        var lista = Arrays.asList("hola", "  ", null, "adiós");
        int suma = Ejercicio16.sumarLongitudesNoVacias(lista);
        assertEquals("hola".length() + "adiós".length(), suma);
    }

    @Test
    @Order(2)
    void ignoraStringsBlancos_yCuentaSoloNoVacias() {
        var lista = Arrays.asList("a", "  b  ", "", "   ", null, "cd");
        assertEquals("a".length() + "b".length() + "cd".length(), Ejercicio16.sumarLongitudesNoVacias(lista));
    }

}
