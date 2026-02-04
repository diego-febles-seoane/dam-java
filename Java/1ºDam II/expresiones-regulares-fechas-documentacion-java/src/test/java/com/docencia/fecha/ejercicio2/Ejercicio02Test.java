package com.docencia.fecha.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class Ejercicio02Test {

    // ===== Defensiva: nulls =====

    @Test
    void shouldThrowWhenTimeIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio02.estaDentroCircular(null, LocalTime.of(22, 0), LocalTime.of(6, 0)));
    }

    @Test
    void shouldThrowWhenInicioIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio02.estaDentroCircular(LocalTime.of(23, 0), null, LocalTime.of(6, 0)));
    }

    @Test
    void shouldThrowWhenFinIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio02.estaDentroCircular(LocalTime.of(23, 0), LocalTime.of(22, 0), null));
    }

    // ===== inicio == fin =====

    @Test
    void shouldReturnFalseWhenInicioEqualsFinAtSameTime() {
        assertFalse(Ejercicio02.estaDentroCircular(LocalTime.of(10, 0), LocalTime.of(10, 0), LocalTime.of(10, 0)));
    }

    // ===== Intervalo normal (inicio < fin) =====

    @Test
    void shouldReturnTrueWhenTimeEqualsInicioInNormalInterval() {
        assertTrue(Ejercicio02.estaDentroCircular(LocalTime.of(9, 0), LocalTime.of(9, 0), LocalTime.of(12, 0)));
    }

    @Test
    void shouldReturnFalseWhenTimeEqualsFinInNormalInterval() {
        assertFalse(Ejercicio02.estaDentroCircular(LocalTime.of(12, 0), LocalTime.of(9, 0), LocalTime.of(12, 0)));
    }

    @Test
    void shouldReturnTrueWhenTimeInsideNormalInterval() {
        assertTrue(Ejercicio02.estaDentroCircular(LocalTime.of(10, 30), LocalTime.of(9, 0), LocalTime.of(12, 0)));
    }

    @Test
    void shouldReturnFalseWhenTimeBeforeInicioInNormalInterval() {
        assertFalse(Ejercicio02.estaDentroCircular(LocalTime.of(8, 59), LocalTime.of(9, 0), LocalTime.of(12, 0)));
    }

    @Test
    void shouldReturnFalseWhenTimeAfterFinInNormalInterval() {
        assertFalse(Ejercicio02.estaDentroCircular(LocalTime.of(12, 1), LocalTime.of(9, 0), LocalTime.of(12, 0)));
    }

    // ===== Intervalo circular (cruza medianoche: inicio > fin) =====

    @Test
    void shouldReturnTrueWhenTimeEqualsInicioInCircularInterval() {
        assertTrue(Ejercicio02.estaDentroCircular(LocalTime.of(22, 0), LocalTime.of(22, 0), LocalTime.of(6, 0)));
    }

    @Test
    void shouldReturnFalseWhenTimeEqualsFinInCircularInterval() {
        assertFalse(Ejercicio02.estaDentroCircular(LocalTime.of(6, 0), LocalTime.of(22, 0), LocalTime.of(6, 0)));
    }

    @Test
    void shouldReturnTrueWhenTimeIsLateNightInCircularInterval() {
        assertTrue(Ejercicio02.estaDentroCircular(LocalTime.of(23, 0), LocalTime.of(22, 0), LocalTime.of(6, 0)));
    }

    @Test
    void shouldReturnTrueWhenTimeIsEarlyMorningInCircularInterval() {
        assertTrue(Ejercicio02.estaDentroCircular(LocalTime.of(5, 59), LocalTime.of(22, 0), LocalTime.of(6, 0)));
    }

    @Test
    void shouldReturnFalseWhenTimeIsBetweenFinAndInicioInCircularInterval() {
        // fuera del intervalo: (06:00, 22:00)
        assertFalse(Ejercicio02.estaDentroCircular(LocalTime.of(12, 0), LocalTime.of(22, 0), LocalTime.of(6, 0)));
    }

    @Test
    void shouldWorkWithSecondsPrecisionNearFinInCircularInterval() {
        assertTrue(Ejercicio02.estaDentroCircular(LocalTime.of(5, 59, 59), LocalTime.of(22, 0), LocalTime.of(6, 0)));
        assertFalse(Ejercicio02.estaDentroCircular(LocalTime.of(6, 0, 0), LocalTime.of(22, 0), LocalTime.of(6, 0)));
    }

    @Test
    void shouldIncludeLastNanoOfDayInCircularInterval() {
        assertTrue(Ejercicio02.estaDentroCircular(LocalTime.of(23, 59, 59, 999_999_999),
                LocalTime.of(22, 0), LocalTime.of(6, 0)));
    }

    // ===== Bordes interesantes =====

    @Test
    void shouldReturnFalseWhenTimeIsExactlyAtFinNormalInterval() {
        assertFalse(Ejercicio02.estaDentroCircular(LocalTime.of(6, 0), LocalTime.of(1, 0), LocalTime.of(6, 0)));
    }

    @Test
    void shouldReturnTrueWhenTimeIsExactlyAtInicioNormalInterval() {
        assertTrue(Ejercicio02.estaDentroCircular(LocalTime.of(1, 0), LocalTime.of(1, 0), LocalTime.of(6, 0)));
    }
}

