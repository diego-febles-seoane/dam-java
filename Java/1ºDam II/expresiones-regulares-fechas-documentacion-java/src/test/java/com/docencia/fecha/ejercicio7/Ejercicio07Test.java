package com.docencia.fecha.ejercicio7;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class Ejercicio07Test {

    @Test
    void shouldThrowWhenAIniIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio07.solapan(null, LocalTime.of(12, 0), LocalTime.of(11, 0), LocalTime.of(13, 0)));
    }

    @Test
    void shouldThrowWhenAFinIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio07.solapan(LocalTime.of(10, 0), null, LocalTime.of(11, 0), LocalTime.of(13, 0)));
    }

    @Test
    void shouldThrowWhenBIniIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio07.solapan(LocalTime.of(10, 0), LocalTime.of(12, 0), null, LocalTime.of(13, 0)));
    }

    @Test
    void shouldThrowWhenBFinIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio07.solapan(LocalTime.of(10, 0), LocalTime.of(12, 0), LocalTime.of(11, 0), null));
    }

    @Test
    void shouldThrowWhenIntervalAHasEqualStartAndEnd() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio07.solapan(LocalTime.of(10, 0), LocalTime.of(10, 0), LocalTime.of(11, 0), LocalTime.of(12, 0)));
    }

    @Test
    void shouldThrowWhenIntervalAStartAfterEnd() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio07.solapan(LocalTime.of(12, 0), LocalTime.of(10, 0), LocalTime.of(11, 0), LocalTime.of(13, 0)));
    }

    @Test
    void shouldThrowWhenIntervalBHasEqualStartAndEnd() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio07.solapan(LocalTime.of(10, 0), LocalTime.of(12, 0), LocalTime.of(11, 0), LocalTime.of(11, 0)));
    }

    @Test
    void shouldThrowWhenIntervalBStartAfterEnd() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio07.solapan(LocalTime.of(10, 0), LocalTime.of(12, 0), LocalTime.of(13, 0), LocalTime.of(11, 0)));
    }

    @Test
    void shouldReturnTrueWhenIntervalsOverlapPartially() {
        // [10:00,12:00) y [11:00,13:00)
        assertTrue(Ejercicio07.solapan(LocalTime.of(10, 0), LocalTime.of(12, 0),
                LocalTime.of(11, 0), LocalTime.of(13, 0)));
    }

    @Test
    void shouldReturnFalseWhenIntervalsJustTouchAtEndStart() {
        // [10:00,12:00) y [12:00,14:00) -> NO solapan (fin excluido)
        assertFalse(Ejercicio07.solapan(LocalTime.of(10, 0), LocalTime.of(12, 0),
                LocalTime.of(12, 0), LocalTime.of(14, 0)));
    }

    @Test
    void shouldReturnTrueWhenOneIntervalInsideAnother() {
        // B dentro de A
        assertTrue(Ejercicio07.solapan(LocalTime.of(10, 0), LocalTime.of(14, 0),
                LocalTime.of(11, 0), LocalTime.of(12, 0)));
    }

    @Test
    void shouldReturnFalseWhenIntervalsAreDisjoint() {
        // [08:00,09:00) y [10:00,11:00)
        assertFalse(Ejercicio07.solapan(LocalTime.of(8, 0), LocalTime.of(9, 0),
                LocalTime.of(10, 0), LocalTime.of(11, 0)));
    }

    @Test
    void shouldReturnTrueWhenIntervalsOverlapByOneMinute() {
        // [10:00,10:01) y [10:00,10:02)
        assertTrue(Ejercicio07.solapan(LocalTime.of(10, 0), LocalTime.of(10, 1),
                LocalTime.of(10, 0), LocalTime.of(10, 2)));
    }

    @Test
    void shouldReturnFalseWhenBEndsExactlyAtAStart() {
        // B termina justo en el inicio de A -> no solapan
        assertFalse(Ejercicio07.solapan(LocalTime.of(10, 0), LocalTime.of(12, 0),
                LocalTime.of(8, 0), LocalTime.of(10, 0)));
    }

    @Test
    void shouldReturnTrueWhenAStartsBeforeBEndsAndBStartsBeforeAEnds() {
        // Caso general no simétrico de borde
        assertTrue(Ejercicio07.solapan(LocalTime.of(9, 0), LocalTime.of(10, 0),
                LocalTime.of(9, 59), LocalTime.of(11, 0)));
    }
}

