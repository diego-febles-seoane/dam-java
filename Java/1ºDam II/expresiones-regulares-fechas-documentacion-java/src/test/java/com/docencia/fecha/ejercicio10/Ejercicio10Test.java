package com.docencia.fecha.ejercicio10;


import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Ejercicio10Test {

    @Test
    void shouldThrowWhenInicioIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio10.generarAlarmas(null, 15, 4));
    }

    @Test
    void shouldThrowWhenPasoMinIsZero() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio10.generarAlarmas(LocalTime.of(10, 0), 0, 4));
    }

    @Test
    void shouldThrowWhenPasoMinIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio10.generarAlarmas(LocalTime.of(10, 0), -5, 4));
    }

    @Test
    void shouldThrowWhenNIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio10.generarAlarmas(LocalTime.of(10, 0), 15, -1));
    }

    @Test
    void shouldReturnEmptyListWhenNIsZero() {
        List<LocalTime> res = Ejercicio10.generarAlarmas(LocalTime.of(10, 0), 15, 0);
        assertNotNull(res);
        assertTrue(res.isEmpty());
    }

    @Test
    void shouldIncludeInicioAsFirstAlarm() {
        List<LocalTime> res = Ejercicio10.generarAlarmas(LocalTime.of(10, 0), 15, 3);
        assertEquals(LocalTime.of(10, 0), res.get(0));
    }

    @Test
    void shouldGenerateAlarmsWithCorrectStepWithinSameDay() {
        List<LocalTime> res = Ejercicio10.generarAlarmas(LocalTime.of(10, 0), 15, 4);
        assertEquals(List.of(
                LocalTime.of(10, 0),
                LocalTime.of(10, 15),
                LocalTime.of(10, 30),
                LocalTime.of(10, 45)
        ), res);
    }

    @Test
    void shouldWrapToNextDayWhenCrossingMidnight() {
        List<LocalTime> res = Ejercicio10.generarAlarmas(LocalTime.of(23, 50), 15, 4);
        assertEquals(List.of(
                LocalTime.of(23, 50),
                LocalTime.of(0, 5),
                LocalTime.of(0, 20),
                LocalTime.of(0, 35)
        ), res);
    }

    @Test
    void shouldHandleLargeStepValues() {
        // paso 180 min (3h)
        List<LocalTime> res = Ejercicio10.generarAlarmas(LocalTime.of(22, 0), 180, 4);
        assertEquals(List.of(
                LocalTime.of(22, 0),
                LocalTime.of(1, 0),
                LocalTime.of(4, 0),
                LocalTime.of(7, 0)
        ), res);
    }

    @Test
    void shouldPreserveSecondsAndNanosFromInicio() {
        LocalTime inicio = LocalTime.of(10, 0, 45, 123_456_789);
        List<LocalTime> res = Ejercicio10.generarAlarmas(inicio, 30, 3);

        assertEquals(List.of(
                LocalTime.of(10, 0, 45, 123_456_789),
                LocalTime.of(10, 30, 45, 123_456_789),
                LocalTime.of(11, 0, 45, 123_456_789)
        ), res);
    }

    @Test
    void shouldPreserveSecondsAndNanosWhenWrappingMidnight() {
        LocalTime inicio = LocalTime.of(23, 59, 59, 999_999_999);
        List<LocalTime> res = Ejercicio10.generarAlarmas(inicio, 2, 3);

        assertEquals(List.of(
                LocalTime.of(23, 59, 59, 999_999_999),
                LocalTime.of(0, 1, 59, 999_999_999),
                LocalTime.of(0, 3, 59, 999_999_999)
        ), res);
    }

    @Test
    void shouldReturnListWithRequestedSize() {
        List<LocalTime> res = Ejercicio10.generarAlarmas(LocalTime.of(10, 0), 1, 123);
        assertEquals(123, res.size());
    }
}

