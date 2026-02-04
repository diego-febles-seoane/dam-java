package com.docencia.clases.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.junit.jupiter.api.Test;

public class RegistroUsuarioTest {

    private Clock fixedClock() {
        return Clock.fixed(Instant.parse("2026-02-02T10:00:00Z"), ZoneId.of("UTC"));
    }

    @Test
    void shouldCreateFechaRegistroFromClock() {
        RegistroUsuario u = new RegistroUsuario(
                "ana@test.com", "Abcd1234", "+34600111222",
                LocalDate.of(2000, 1, 1),
                fixedClock()
        );
        assertEquals(2026, u.getFechaRegistro().getYear());
        assertEquals(2, u.getFechaRegistro().getMonthValue());
        assertEquals(2, u.getFechaRegistro().getDayOfMonth());
    }

    @Test
    void shouldValidateWhenAllFieldsAreCorrect() {
        RegistroUsuario u = new RegistroUsuario(
                "ana.lopez@gmail.com", "Abcd1234", "+34 600111222",
                LocalDate.of(2000, 1, 1),
                fixedClock()
        );
        assertDoesNotThrow(() -> u.validate(14));
    }

    @Test
    void shouldThrowWhenEmailIsInvalid() {
        RegistroUsuario u = new RegistroUsuario(
                "ana..gmail.com", "Abcd1234", "+34600111222",
                LocalDate.of(2000, 1, 1),
                fixedClock()
        );
        assertThrows(IllegalArgumentException.class, () -> u.validate(14));
    }

    @Test
    void shouldThrowWhenPasswordIsWeak() {
        RegistroUsuario u = new RegistroUsuario(
                "ana@test.com", "abcd1234", "+34600111222",
                LocalDate.of(2000, 1, 1),
                fixedClock()
        );
        assertThrows(IllegalArgumentException.class, () -> u.validate(14));
    }

    @Test
    void shouldThrowWhenPhoneIsInvalid() {
        RegistroUsuario u = new RegistroUsuario(
                "ana@test.com", "Abcd1234", "600111222",
                LocalDate.of(2000, 1, 1),
                fixedClock()
        );
        assertThrows(IllegalArgumentException.class, () -> u.validate(14));
    }

    @Test
    void shouldThrowWhenBirthDateIsFuture() {
        RegistroUsuario u = new RegistroUsuario(
                "ana@test.com", "Abcd1234", "+34600111222",
                LocalDate.of(2026, 2, 3),
                fixedClock()
        );
        assertThrows(IllegalArgumentException.class, () -> u.validate(14));
    }

    @Test
    void shouldThrowWhenUnderMinimumAge() {
        RegistroUsuario u = new RegistroUsuario(
                "ana@test.com", "Abcd1234", "+34600111222",
                LocalDate.of(2015, 2, 3),
                fixedClock()
        );
        assertThrows(IllegalArgumentException.class, () -> u.validate(14));
    }
}


