package com.docencia.fecha.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class Ejercicio03Test {

    @Test
    void shouldThrowWhenAhoraIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio03.minutosHasta(null, LocalTime.of(10, 0)));
    }

    @Test
    void shouldThrowWhenObjetivoIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio03.minutosHasta(LocalTime.of(10, 0), null));
    }

    @Test
    void shouldReturnZeroWhenAhoraEqualsObjetivo() {
        assertEquals(0, Ejercicio03.minutosHasta(LocalTime.of(10, 0), LocalTime.of(10, 0)));
    }

    @Test
    void shouldReturnPositiveMinutesWhenObjetivoAfterAhoraSameDay() {
        assertEquals(10, Ejercicio03.minutosHasta(LocalTime.of(10, 0), LocalTime.of(10, 10)));
    }

    @Test
    void shouldReturnMinutesWhenObjetivoBeforeAhoraNextDay() {
        assertEquals(20, Ejercicio03.minutosHasta(LocalTime.of(23, 50), LocalTime.of(0, 10)));
    }

    @Test
    void shouldReturnOneMinuteWhenCrossingMidnightByOneMinute() {
        assertEquals(1, Ejercicio03.minutosHasta(LocalTime.of(23, 59), LocalTime.of(0, 0)));
    }

    @Test
    void shouldReturnFullDayMinusOneMinuteWhenObjetivoOneMinuteBeforeAhora() {
        // de 10:00 a 09:59 del día siguiente = 23h 59m = 1439
        assertEquals(1439, Ejercicio03.minutosHasta(LocalTime.of(10, 0), LocalTime.of(9, 59)));
    }

    @Test
    void shouldReturnMinutesWhenAhoraIsMidnightAndObjetivoLater() {
        assertEquals(15, Ejercicio03.minutosHasta(LocalTime.of(0, 0), LocalTime.of(0, 15)));
    }

    @Test
    void shouldReturnMinutesWhenObjetivoIsMidnightAndAhoraLater() {
        // de 12:00 a 00:00 del día siguiente = 12h = 720
        assertEquals(720, Ejercicio03.minutosHasta(LocalTime.of(12, 0), LocalTime.of(0, 0)));
    }


    @Test
    void shouldReturnLargeJumpWhenAhoraNearEndOfDay() {
        // 23:00 -> 22:00 (mañana) = 23h = 1380 min
        assertEquals(1380, Ejercicio03.minutosHasta(LocalTime.of(23, 0), LocalTime.of(22, 0)));
    }
}

