package com.docencia.clases.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class TarjetaEmbarqueTest {

    @Test
    void shouldThrowWhenHoyIsNullOnValidate() {
        TarjetaEmbarque bp = new TarjetaEmbarque("BP-IB-2026-A1B2C3", LocalDate.of(2026, 2, 2), LocalTime.of(12, 0));
        assertThrows(IllegalArgumentException.class, () -> bp.validate(null));
    }

    @Test
    void shouldThrowWhenAnyFieldIsNull() {
        TarjetaEmbarque bp = new TarjetaEmbarque(null, LocalDate.of(2026, 2, 2), LocalTime.of(12, 0));
        assertThrows(IllegalArgumentException.class, () -> bp.validate(LocalDate.of(2026, 2, 2)));
    }

    @Test
    void shouldThrowWhenCodigoDoesNotMatchRegex() {
        TarjetaEmbarque bp = new TarjetaEmbarque("BP-IB-26-A1B2C3", LocalDate.of(2026, 2, 2), LocalTime.of(12, 0));
        assertThrows(IllegalArgumentException.class, () -> bp.validate(LocalDate.of(2026, 2, 2)));
    }

    @Test
    void shouldThrowWhenFechaVueloIsInPast() {
        TarjetaEmbarque bp = new TarjetaEmbarque("BP-IB-2026-A1B2C3", LocalDate.of(2026, 2, 1), LocalTime.of(12, 0));
        assertThrows(IllegalArgumentException.class, () -> bp.validate(LocalDate.of(2026, 2, 2)));
    }

    @Test
    void shouldReturnFalseWhenVueloIsInFuture() {
        LocalDate hoy = LocalDate.of(2026, 2, 2);
        TarjetaEmbarque bp = new TarjetaEmbarque("BP-IB-2026-A1B2C3", LocalDate.of(2026, 2, 3), LocalTime.of(12, 0));

        assertFalse(bp.puedeEmbarcar(hoy, LocalTime.of(11, 30)));
    }

    @Test
    void shouldAllowBoardingAtOpeningTimeInclusive() {
        LocalDate hoy = LocalDate.of(2026, 2, 2);
        TarjetaEmbarque bp = new TarjetaEmbarque("BP-IB-2026-A1B2C3", hoy, LocalTime.of(12, 0));

        // apertura = 11:15
        assertTrue(bp.puedeEmbarcar(hoy, LocalTime.of(11, 15)));
    }

    @Test
    void shouldNotAllowBoardingAtClosingTimeExclusive() {
        LocalDate hoy = LocalDate.of(2026, 2, 2);
        TarjetaEmbarque bp = new TarjetaEmbarque("BP-IB-2026-A1B2C3", hoy, LocalTime.of(12, 0));

        // cierre = 11:50 (excluido)
        assertFalse(bp.puedeEmbarcar(hoy, LocalTime.of(11, 50)));
    }

    @Test
    void shouldAllowBoardingInsideWindow() {
        LocalDate hoy = LocalDate.of(2026, 2, 2);
        TarjetaEmbarque bp = new TarjetaEmbarque("BP-IB-2026-A1B2C3", hoy, LocalTime.of(12, 0));

        assertTrue(bp.puedeEmbarcar(hoy, LocalTime.of(11, 30)));
        assertTrue(bp.puedeEmbarcar(hoy, LocalTime.of(11, 49)));
    }

    @Test
    void shouldNotAllowBoardingBeforeWindow() {
        LocalDate hoy = LocalDate.of(2026, 2, 2);
        TarjetaEmbarque bp = new TarjetaEmbarque("BP-IB-2026-A1B2C3", hoy, LocalTime.of(12, 0));

        assertFalse(bp.puedeEmbarcar(hoy, LocalTime.of(11, 14)));
    }

    @Test
    void shouldHandleCrossMidnightWindow() {
        // salida 00:20 -> apertura 23:35 (día anterior) y cierre 00:10
        LocalDate hoy = LocalDate.of(2026, 2, 2);
        TarjetaEmbarque bp = new TarjetaEmbarque("BP-IB-2026-A1B2C3", hoy, LocalTime.of(0, 20));

        // dentro: 23:40 (antes de medianoche)
        assertTrue(bp.puedeEmbarcar(hoy, LocalTime.of(23, 40)));
        // dentro: 00:05 (después de medianoche)
        assertTrue(bp.puedeEmbarcar(hoy, LocalTime.of(0, 5)));

        // fuera: 00:10 (cierre excluido)
        assertFalse(bp.puedeEmbarcar(hoy, LocalTime.of(0, 10)));
        // fuera: 23:34 (antes de apertura)
        assertFalse(bp.puedeEmbarcar(hoy, LocalTime.of(23, 34)));
    }

    @Test
    void shouldThrowWhenAhoraIsNull() {
        LocalDate hoy = LocalDate.of(2026, 2, 2);
        TarjetaEmbarque bp = new TarjetaEmbarque("BP-IB-2026-A1B2C3", hoy, LocalTime.of(12, 0));
        assertThrows(IllegalArgumentException.class, () -> bp.puedeEmbarcar(hoy, null));
    }
}

