package com.docencia.fechas.ejercicio7;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.Period;
import org.junit.jupiter.api.Test;

class FechasPeriod7Test {

  @Test
  void entreDebeDevolverPeriodo() {
    Period p = FechasPeriod7.entre(LocalDate.of(2026,1,1), LocalDate.of(2026,1,11));
    assertEquals(10, p.getDays(), "Error: del 1 al 11 de enero son 10 dias");
  }

  @Test
  void sumarDebeAplicarPeriodo() {
    Period p = Period.ofDays(5);
    assertEquals(LocalDate.of(2026,1,6), FechasPeriod7.sumar(LocalDate.of(2026,1,1), p),
        "Error: sumar 5 dias debe dar 6 de enero");
  }

  @Test
  void diasDebeDevolverComponenteDias() {
    assertEquals(3, FechasPeriod7.dias(Period.of(0,0,3)), "Error: dias debe devolver 3");
  }

  @Test
  void entreDebeSerCeroSiMismaFecha() {
    Period p = FechasPeriod7.entre(LocalDate.of(2026,1,1), LocalDate.of(2026,1,1));
    assertEquals(0, p.getDays(), "Error: mismo dia debe dar 0 dias");
  }

  @Test
  void entreNoDebeSerNulo() {
    assertNotNull(FechasPeriod7.entre(LocalDate.of(2026,1,1), LocalDate.of(2026,1,2)),
        "Error: entre no debe devolver null");
  }
}
