package com.docencia.arrays.ejercicio7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ejercicio7Test {
    @Test
    @Order(1)
    void sonIgualesArraysIgualesDevuelveTrue() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};

        assertTrue(Ejercicio7.sonIguales(a, b));
    }

    @Test
    @Order(2)
    void sonIgualesArraysDistintaLongitudDevuelveFalse() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3, 4};

        assertFalse(Ejercicio7.sonIguales(a, b));
    }

    @Test
    @Order(3)
    void sonIgualesArraysMismosElementosDistintoOrdenDevuelveFalse() {
        int[] a = {1, 2, 3};
        int[] b = {3, 2, 1};

        assertFalse(Ejercicio7.sonIguales(a, b));
    }

    @Test
    @Order(4)
    void sonIgualesArraysConDiferenciasDevuelveFalse() {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 0, 4};

        assertFalse(Ejercicio7.sonIguales(a, b));
    }
}
