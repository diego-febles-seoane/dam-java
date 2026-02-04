package com.docencia.clases.ejercicio2;


import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class ReservaHotelTest {

    @Test
    void shouldValidateWhenReservaIsCorrect() {
        ReservaHotel r = new ReservaHotel("RES-2026-ABC", "12345678Z",
                LocalDate.of(2026, 2, 10),
                LocalDate.of(2026, 2, 12));
        assertDoesNotThrow(r::validate);
    }

    @Test
    void shouldThrowWhenCodigoIsInvalid() {
        ReservaHotel r = new ReservaHotel("RES-26-ABC", "12345678Z",
                LocalDate.of(2026, 2, 10),
                LocalDate.of(2026, 2, 12));
        assertThrows(IllegalArgumentException.class, r::validate);
    }

    @Test
    void shouldThrowWhenDniLetterIsWrong() {
        ReservaHotel r = new ReservaHotel("RES-2026-ABC", "12345678A",
                LocalDate.of(2026, 2, 10),
                LocalDate.of(2026, 2, 12));
        assertThrows(IllegalArgumentException.class, r::validate);
    }

    @Test
    void shouldThrowWhenCheckOutIsNotAfterCheckIn() {
        ReservaHotel r = new ReservaHotel("RES-2026-ABC", "12345678Z",
                LocalDate.of(2026, 2, 10),
                LocalDate.of(2026, 2, 10));
        assertThrows(IllegalArgumentException.class, r::validate);
    }

    @Test
    void shouldCalculateNochesCorrectly() {
        ReservaHotel r = new ReservaHotel("RES-2026-ABC", "12345678Z",
                LocalDate.of(2026, 2, 10),
                LocalDate.of(2026, 2, 12));
        assertEquals(2, r.noches());
    }

    @Test
    void shouldAllowCancelTwoDaysBeforeOrEarlier() {
        ReservaHotel r = new ReservaHotel("RES-2026-ABC", "12345678Z",
                LocalDate.of(2026, 2, 10),
                LocalDate.of(2026, 2, 12));

        assertTrue(r.puedeCancelar(LocalDate.of(2026, 2, 8)));  // checkIn - 2
        assertTrue(r.puedeCancelar(LocalDate.of(2026, 2, 7)));  // earlier
    }

    @Test
    void shouldNotAllowCancelAfterDeadline() {
        ReservaHotel r = new ReservaHotel("RES-2026-ABC", "12345678Z",
                LocalDate.of(2026, 2, 10),
                LocalDate.of(2026, 2, 12));

        assertFalse(r.puedeCancelar(LocalDate.of(2026, 2, 9))); // after checkIn - 2
    }
}

