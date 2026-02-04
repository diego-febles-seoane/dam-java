package com.docencia.fecha.ejercicio1;


import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class Ejercicio01Test {

    @Test
    void shouldThrowWhenTimeIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio01.estaDentro(null, LocalTime.of(9, 0), LocalTime.of(12, 0)));
    }

    @Test
    void shouldThrowWhenInicioIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio01.estaDentro(LocalTime.of(10, 0), null, LocalTime.of(12, 0)));
    }

    @Test
    void shouldThrowWhenFinIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio01.estaDentro(LocalTime.of(10, 0), LocalTime.of(9, 0), null));
    }

    @Test
    void shouldReturnFalseWhenInicioEqualsFin() {
        assertFalse(Ejercicio01.estaDentro(LocalTime.of(10, 0), LocalTime.of(9, 0), LocalTime.of(9, 0)));
    }

    @Test
    void shouldThrowWhenInicioAfterFin() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio01.estaDentro(LocalTime.of(23, 0), LocalTime.of(22, 0), LocalTime.of(6, 0)));
    }

    @Test
    void shouldReturnTrueWhenTimeEqualsInicio() {
        assertTrue(Ejercicio01.estaDentro(LocalTime.of(9, 0), LocalTime.of(9, 0), LocalTime.of(12, 0)));
    }

    @Test
    void shouldReturnFalseWhenTimeEqualsFin() {
        assertFalse(Ejercicio01.estaDentro(LocalTime.of(12, 0), LocalTime.of(9, 0), LocalTime.of(12, 0)));
    }

    @Test
    void shouldReturnTrueWhenTimeIsInsideInterval() {
        assertTrue(Ejercicio01.estaDentro(LocalTime.of(10, 0), LocalTime.of(9, 0), LocalTime.of(12, 0)));
    }

    @Test
    void shouldReturnFalseWhenTimeIsBeforeInicio() {
        assertFalse(Ejercicio01.estaDentro(LocalTime.of(8, 59), LocalTime.of(9, 0), LocalTime.of(12, 0)));
    }

    @Test
    void shouldReturnFalseWhenTimeIsAfterFin() {
        assertFalse(Ejercicio01.estaDentro(LocalTime.of(12, 1), LocalTime.of(9, 0), LocalTime.of(12, 0)));
    }

    @Test
    void shouldWorkWithSecondPrecisionInsideInterval() {
        assertTrue(Ejercicio01.estaDentro(LocalTime.of(11, 59, 59), LocalTime.of(9, 0), LocalTime.of(12, 0)));
    }

    @Test
    void shouldReturnFalseForLastNanoAtFin() {
        // Justo antes de fin: válido
        assertTrue(Ejercicio01.estaDentro(LocalTime.of(11, 59, 59, 999_999_999), LocalTime.of(9, 0), LocalTime.of(12, 0)));
        // En fin exacto: inválido (fin excluido)
        assertFalse(Ejercicio01.estaDentro(LocalTime.of(12, 0, 0, 0), LocalTime.of(9, 0), LocalTime.of(12, 0)));
    }
}
