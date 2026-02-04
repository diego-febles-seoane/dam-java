package com.docencia.clases.ejercicio5;


import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class TurnoEmpleadoTest {

    @Test
    void shouldValidateWhenTurnoIsCorrect() {
        TurnoEmpleado t = new TurnoEmpleado("EMP-00001", LocalDate.of(2026, 2, 2),
                LocalTime.of(9, 0), LocalTime.of(17, 0));
        assertDoesNotThrow(t::validate);
        assertEquals("09:00-17:00", t.franja());
    }

    @Test
    void shouldThrowWhenEmpleadoIdIsInvalid() {
        TurnoEmpleado t = new TurnoEmpleado("EMP-1", LocalDate.of(2026, 2, 2),
                LocalTime.of(9, 0), LocalTime.of(17, 0));
        assertThrows(IllegalArgumentException.class, t::validate);
    }

    @Test
    void shouldThrowWhenTurnoIsEmpty() {
        TurnoEmpleado t = new TurnoEmpleado("EMP-00001", LocalDate.of(2026, 2, 2),
                LocalTime.of(9, 0), LocalTime.of(9, 0));
        assertThrows(IllegalArgumentException.class, t::validate);
    }

    @Test
    void shouldComputeFinDateTimeNextDayWhenCrossingMidnight() {
        TurnoEmpleado t = new TurnoEmpleado("EMP-00001", LocalDate.of(2026, 2, 2),
                LocalTime.of(22, 0), LocalTime.of(6, 0));

        assertEquals(LocalDate.of(2026, 2, 2), t.inicioDateTime().toLocalDate());
        assertEquals(LocalDate.of(2026, 2, 3), t.finDateTime().toLocalDate());
    }

    @Test
    void shouldReturnTrueWhenRestIsAtLeast12HoursAcrossMidnightTurn() {
        TurnoEmpleado anterior = new TurnoEmpleado("EMP-00001", LocalDate.of(2026, 2, 1),
                LocalTime.of(20, 0), LocalTime.of(23, 0));

        TurnoEmpleado actual = new TurnoEmpleado("EMP-00001", LocalDate.of(2026, 2, 2),
                LocalTime.of(11, 0), LocalTime.of(15, 0));

        assertTrue(actual.cumpleDescansoMinimoDesde(anterior, 12));
    }

    @Test
    void shouldReturnFalseWhenRestIsLessThan12Hours() {
        TurnoEmpleado anterior = new TurnoEmpleado("EMP-00001", LocalDate.of(2026, 2, 1),
                LocalTime.of(20, 0), LocalTime.of(23, 0));

        TurnoEmpleado actual = new TurnoEmpleado("EMP-00001", LocalDate.of(2026, 2, 2),
                LocalTime.of(10, 0), LocalTime.of(15, 0));

        assertFalse(actual.cumpleDescansoMinimoDesde(anterior, 12));
    }

    @Test
    void shouldReturnFalseWhenOrderIsNotChronological() {
        TurnoEmpleado anterior = new TurnoEmpleado("EMP-00001", LocalDate.of(2026, 2, 2),
                LocalTime.of(9, 0), LocalTime.of(17, 0));

        TurnoEmpleado actual = new TurnoEmpleado("EMP-00001", LocalDate.of(2026, 2, 1),
                LocalTime.of(8, 0), LocalTime.of(12, 0));

        assertFalse(actual.cumpleDescansoMinimoDesde(anterior, 12));
    }
}

