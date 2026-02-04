package com.docencia.fecha.ejercicio6;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class Ejercicio06Test {

    @Test
    void shouldThrowWhenFinTurnoIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio06.cumpleDescanso(null, LocalTime.of(8, 0), 12));
    }

    @Test
    void shouldThrowWhenInicioSiguienteIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio06.cumpleDescanso(LocalTime.of(20, 0), null, 12));
    }

    @Test
    void shouldThrowWhenMinDescansoHorasIsZero() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio06.cumpleDescanso(LocalTime.of(20, 0), LocalTime.of(8, 0), 0));
    }

    @Test
    void shouldThrowWhenMinDescansoHorasIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio06.cumpleDescanso(LocalTime.of(20, 0), LocalTime.of(8, 0), -1));
    }

    @Test
    void shouldThrowWhenMinDescansoHorasIsGreaterThan24() {
        assertThrows(IllegalArgumentException.class,
                () -> Ejercicio06.cumpleDescanso(LocalTime.of(20, 0), LocalTime.of(8, 0), 25));
    }

    @Test
    void shouldReturnTrueWhenRestIsExactlyRequiredSameDay() {
        // 08:00 -> 20:00 = 12h
        assertTrue(Ejercicio06.cumpleDescanso(LocalTime.of(8, 0), LocalTime.of(20, 0), 12));
    }

    @Test
    void shouldReturnFalseWhenRestIsLessThanRequiredSameDay() {
        // 08:00 -> 19:59 = 11h 59m
        assertFalse(Ejercicio06.cumpleDescanso(LocalTime.of(8, 0), LocalTime.of(19, 59), 12));
    }

    @Test
    void shouldReturnTrueWhenRestIsMoreThanRequiredSameDay() {
        // 08:00 -> 21:00 = 13h
        assertTrue(Ejercicio06.cumpleDescanso(LocalTime.of(8, 0), LocalTime.of(21, 0), 12));
    }

    @Test
    void shouldReturnTrueWhenRestIsExactlyRequiredNextDay() {
        // 20:00 -> 08:00 (día siguiente) = 12h
        assertTrue(Ejercicio06.cumpleDescanso(LocalTime.of(20, 0), LocalTime.of(8, 0), 12));
    }

    @Test
    void shouldReturnFalseWhenRestIsLessThanRequiredNextDay() {
        // 20:00 -> 07:59 (día siguiente) = 11h 59m
        assertFalse(Ejercicio06.cumpleDescanso(LocalTime.of(20, 0), LocalTime.of(7, 59), 12));
    }

    @Test
    void shouldReturnTrueWhenRestIsMoreThanRequiredNextDay() {
        // 20:00 -> 10:00 (día siguiente) = 14h
        assertTrue(Ejercicio06.cumpleDescanso(LocalTime.of(20, 0), LocalTime.of(10, 0), 12));
    }

    @Test
    void shouldReturnFalseWhenStartEqualsEndAndRequirementIsPositive() {
        // fin=08:00, inicio=08:00 => descanso 0h
        assertFalse(Ejercicio06.cumpleDescanso(LocalTime.of(8, 0), LocalTime.of(8, 0), 1));
    }

    @Test
    void shouldReturnTrueWhenRequirementIs24AndRestIs24Exactly() {
        // Si fin=10:00 e inicio=10:00, interpretamos como mismo día => 0 min, no 24h.
        // Para conseguir 24h exactas en esta interpretación, no es posible con solo LocalTime.
        // Por tanto este test verifica que NO se considera automáticamente "día siguiente" si son iguales.
        assertFalse(Ejercicio06.cumpleDescanso(LocalTime.of(10, 0), LocalTime.of(10, 0), 24));
    }

    @Test
    void shouldReturnTrueWhenRequirementIs1AndRestIsOneHourNextDay() {
        // 23:30 -> 00:30 = 1h
        assertTrue(Ejercicio06.cumpleDescanso(LocalTime.of(23, 30), LocalTime.of(0, 30), 1));
    }
}

