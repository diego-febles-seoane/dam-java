package com.docencia.fecha.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Ejercicio08Test {

    @Test
    void shouldThrowWhenFranjaIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio08.normalizarFranja(null));
    }

    @Test
    void shouldThrowWhenFranjaIsEmpty() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio08.normalizarFranja(""));
    }

    @Test
    void shouldThrowWhenFranjaIsBlank() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio08.normalizarFranja("   "));
    }

    @Test
    void shouldThrowWhenFormatIsInvalidMissingLeadingZero() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio08.normalizarFranja("9:30-12:15"));
    }

    @Test
    void shouldThrowWhenFormatIsInvalidWrongSeparator() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio08.normalizarFranja("09:30/12:15"));
    }

    @Test
    void shouldThrowWhenFormatIsInvalidNoDash() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio08.normalizarFranja("09:30 12:15"));
    }

    @Test
    void shouldThrowWhenHourIsOutOfRange24() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio08.normalizarFranja("24:00-06:00"));
    }

    @Test
    void shouldThrowWhenHourIsOutOfRangeNegativeNotPossibleButKeptByRegex() {
        // No llega por regex (no admite '-'), pero lo dejamos como test didáctico:
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio08.normalizarFranja("00:00--1:00"));
    }

    @Test
    void shouldThrowWhenMinutesAreOutOfRange60() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio08.normalizarFranja("10:60-12:00"));
    }

    @Test
    void shouldThrowWhenMinutesAreOutOfRangeAtEnd() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio08.normalizarFranja("10:00-12:99"));
    }

    @Test
    void shouldThrowWhenInicioEqualsFin() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio08.normalizarFranja("10:00-10:00"));
    }

    @Test
    void shouldReturnSameWhenAlreadyNormalizedSameDayInterval() {
        assertEquals("09:30-12:15",
                Ejercicio08.normalizarFranja("09:30-12:15"));
    }

    @Test
    void shouldReturnSameWhenAlreadyNormalizedCrossingMidnightInterval() {
        assertEquals("22:00-06:00",
                Ejercicio08.normalizarFranja("22:00-06:00"));
    }

    @Test
    void shouldAcceptMidnightAsValidStart() {
        assertEquals("00:00-01:00",
                Ejercicio08.normalizarFranja("00:00-01:00"));
    }

    @Test
    void shouldAcceptMidnightAsValidEnd() {
        assertEquals("23:00-00:30",
                Ejercicio08.normalizarFranja("23:00-00:30"));
    }

    @Test
    void shouldAcceptUpperBounds2359() {
        assertEquals("23:59-00:01",
                Ejercicio08.normalizarFranja("23:59-00:01"));
    }
}

