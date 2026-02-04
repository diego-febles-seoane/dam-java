package com.docencia.fecha.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class Ejercicio04Test {

    @Test
    void shouldThrowWhenTimeIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio04.redondearArriba(null, 15));
    }

    @Test
    void shouldThrowWhenPasoMinIsZero() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio04.redondearArriba(LocalTime.of(10, 0), 0));
    }

    @Test
    void shouldThrowWhenPasoMinIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio04.redondearArriba(LocalTime.of(10, 0), -5));
    }

    @Test
    void shouldThrowWhenPasoMinIsGreaterThan60() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio04.redondearArriba(LocalTime.of(10, 0), 61));
    }

    @Test
    void shouldThrowWhenPasoMinDoesNotDivide60() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio04.redondearArriba(LocalTime.of(10, 0), 7));
    }

    @Test
    void shouldReturnSameTimeWhenAlreadyExactMultipleWithoutSeconds() {
        assertEquals(LocalTime.of(10, 15),
                Ejercicio04.redondearArriba(LocalTime.of(10, 15, 0, 0), 15));
    }

    @Test
    void shouldRoundUpToNextBlockWhenMinuteNotMultiple() {
        assertEquals(LocalTime.of(10, 15),
                Ejercicio04.redondearArriba(LocalTime.of(10, 1), 15));
    }

    @Test
    void shouldRoundUpWhenExactMinuteMultipleButHasSeconds() {
        // 10:15:01 -> 10:30
        assertEquals(LocalTime.of(10, 30),
                Ejercicio04.redondearArriba(LocalTime.of(10, 15, 1), 15));
    }

    @Test
    void shouldRoundUpWhenExactMinuteMultipleButHasNanos() {
        // 10:15:00.000000001 -> 10:30
        assertEquals(LocalTime.of(10, 30),
                Ejercicio04.redondearArriba(LocalTime.of(10, 15, 0, 1), 15));
    }

    @Test
    void shouldRoundUpFrom1059To1100WithStep15() {
        assertEquals(LocalTime.of(11, 0),
                Ejercicio04.redondearArriba(LocalTime.of(10, 59), 15));
    }

    @Test
    void shouldWrapToNextDayWhenRoundingPast2359() {
        // 23:59 con paso 15 -> 00:00
        assertEquals(LocalTime.of(0, 0),
                Ejercicio04.redondearArriba(LocalTime.of(23, 59), 15));
    }

    @Test
    void shouldRoundUpCorrectlyWithStep5() {
        // 10:02 -> 10:05
        assertEquals(LocalTime.of(10, 5),
                Ejercicio04.redondearArriba(LocalTime.of(10, 2), 5));
    }

    @Test
    void shouldWrapToNextDayWithStep30() {
        // 23:50 -> 00:00 con paso 30
        assertEquals(LocalTime.of(0, 0),
                Ejercicio04.redondearArriba(LocalTime.of(23, 50), 30));
    }
}

