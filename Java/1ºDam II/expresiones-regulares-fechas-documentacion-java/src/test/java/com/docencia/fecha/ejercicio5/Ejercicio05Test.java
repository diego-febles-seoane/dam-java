package com.docencia.fecha.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class Ejercicio05Test {

    @Test
    void shouldThrowWhenTimeIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio05.sumarMinutos(null, 10));
    }

    @Test
    void shouldReturnSameTimeWhenDeltaIsZero() {
        LocalTime t = LocalTime.of(10, 0);
        assertEquals(t, Ejercicio05.sumarMinutos(t, 0));
    }

    @Test
    void shouldAddMinutesWithinSameDay() {
        assertEquals(LocalTime.of(10, 30),
                Ejercicio05.sumarMinutos(LocalTime.of(10, 0), 30));
    }

    @Test
    void shouldSubtractMinutesWithinSameDay() {
        assertEquals(LocalTime.of(9, 30),
                Ejercicio05.sumarMinutos(LocalTime.of(10, 0), -30));
    }

    @Test
    void shouldWrapToNextDayWhenPassingMidnight() {
        assertEquals(LocalTime.of(0, 10),
                Ejercicio05.sumarMinutos(LocalTime.of(23, 50), 20));
    }

    @Test
    void shouldWrapToPreviousDayWhenSubtractingPastMidnight() {
        assertEquals(LocalTime.of(23, 50),
                Ejercicio05.sumarMinutos(LocalTime.of(0, 10), -20));
    }

    @Test
    void shouldHandleDeltaGreaterThanOneDay() {
        // 1500 min = 25h -> +1h
        assertEquals(LocalTime.of(11, 0),
                Ejercicio05.sumarMinutos(LocalTime.of(10, 0), 1500));
    }

    @Test
    void shouldHandleNegativeDeltaGreaterThanOneDay() {
        // -1500 min = -25h -> -1h
        assertEquals(LocalTime.of(9, 0),
                Ejercicio05.sumarMinutos(LocalTime.of(10, 0), -1500));
    }

    @Test
    void shouldHandleVeryLargePositiveDelta() {
        // Comprobación de robustez: no debe romper ni overflowear
        LocalTime result = Ejercicio05.sumarMinutos(LocalTime.of(10, 0), 1_000_000L);
        assertNotNull(result);

        // Validamos con propiedad: sumar 1_000_000 y restar 1_000_000 devuelve la original
        LocalTime original = LocalTime.of(10, 0);
        LocalTime back = Ejercicio05.sumarMinutos(result, -1_000_000L);
        assertEquals(original, back);
    }

    @Test
    void shouldHandleVeryLargeNegativeDelta() {
        LocalTime result = Ejercicio05.sumarMinutos(LocalTime.of(10, 0), -1_000_000L);
        assertNotNull(result);

        LocalTime original = LocalTime.of(10, 0);
        LocalTime back = Ejercicio05.sumarMinutos(result, 1_000_000L);
        assertEquals(original, back);
    }

    @Test
    void shouldPreserveSecondsAndNanos() {
        LocalTime t = LocalTime.of(10, 0, 45, 123_456_789);
        LocalTime res = Ejercicio05.sumarMinutos(t, 61); // +1h 1m
        assertEquals(LocalTime.of(11, 1, 45, 123_456_789), res);
    }

    @Test
    void shouldWrapAndPreserveSecondsAndNanos() {
        LocalTime t = LocalTime.of(23, 59, 59, 999_999_999);
        LocalTime res = Ejercicio05.sumarMinutos(t, 2); // 00:01 del día siguiente
        assertEquals(LocalTime.of(0, 1, 59, 999_999_999), res);
    }
}

