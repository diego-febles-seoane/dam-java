package com.docencia.clases.ejercicio3;


import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class FacturaTest {

    @Test
    void shouldValidateWhenFacturaIsCorrect() {
        Factura f = new Factura("FAC-2026-000123", "ES6621000418401234567891", "B1234567X",
                LocalDate.of(2026, 2, 1),
                LocalDate.of(2026, 3, 3));
        assertDoesNotThrow(f::validate);
    }

    @Test
    void shouldThrowWhenNumeroFacturaIsInvalid() {
        Factura f = new Factura("FAC-26-123", "ES6621000418401234567891", "B1234567X",
                LocalDate.of(2026, 2, 1),
                LocalDate.of(2026, 3, 3));
        assertThrows(IllegalArgumentException.class, f::validate);
    }

    @Test
    void shouldThrowWhenIbanIsInvalid() {
        Factura f = new Factura("FAC-2026-000123", "ES66-INVALID", "B1234567X",
                LocalDate.of(2026, 2, 1),
                LocalDate.of(2026, 3, 3));
        assertThrows(IllegalArgumentException.class, f::validate);
    }

    @Test
    void shouldThrowWhenNifEmpresaIsInvalid() {
        Factura f = new Factura("FAC-2026-000123", "ES6621000418401234567891", "12345678Z",
                LocalDate.of(2026, 2, 1),
                LocalDate.of(2026, 3, 3));
        assertThrows(IllegalArgumentException.class, f::validate);
    }

    @Test
    void shouldThrowWhenFechaVencimientoBeforeEmision() {
        Factura f = new Factura("FAC-2026-000123", "ES6621000418401234567891", "B1234567X",
                LocalDate.of(2026, 2, 10),
                LocalDate.of(2026, 2, 9));
        assertThrows(IllegalArgumentException.class, f::validate);
    }

    @Test
    void shouldReturnTrueWhenFacturaIsVencida() {
        Factura f = new Factura("FAC-2026-000123", "ES6621000418401234567891", "B1234567X",
                LocalDate.of(2026, 2, 1),
                LocalDate.of(2026, 2, 10));
        assertTrue(f.isVencida(LocalDate.of(2026, 2, 11)));
    }

    @Test
    void shouldReturnFalseWhenFacturaIsNotVencidaOnSameDay() {
        Factura f = new Factura("FAC-2026-000123", "ES6621000418401234567891", "B1234567X",
                LocalDate.of(2026, 2, 1),
                LocalDate.of(2026, 2, 10));
        assertFalse(f.isVencida(LocalDate.of(2026, 2, 10)));
    }
}

