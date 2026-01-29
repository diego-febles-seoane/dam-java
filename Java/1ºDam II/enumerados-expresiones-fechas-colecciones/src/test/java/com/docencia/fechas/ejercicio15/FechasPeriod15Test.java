package com.docencia.fechas.ejercicio15;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.Period;
import org.junit.jupiter.api.Test;

class FechasPeriod15Test {

  @Test
  void crearDebeConstruirPeriodo() {
    assertEquals(Period.of(1,2,3), FechasPeriod15.crear(1,2,3), "Error: crear debe devolver Period.of(1,2,3)");
  }

  @Test
  void normalizarDebeConvertirMesesEnAnios() {
    Period p = Period.of(0, 15, 0).normalized();
    assertEquals(p, FechasPeriod15.normalizar(Period.of(0,15,0)), "Error: 15 meses debe normalizarse");
  }

  @Test
  void sumarDebeAplicarPeriodo() {
    assertEquals(LocalDate.of(2026,2,1), FechasPeriod15.sumar(LocalDate.of(2026,1,1), Period.ofMonths(1)),
        "Error: sumar 1 mes a 2026-01-01 debe dar 2026-02-01");
  }

  @Test
  void sumarDebeAplicarDias() {
    assertEquals(LocalDate.of(2026,1,11), FechasPeriod15.sumar(LocalDate.of(2026,1,1), Period.ofDays(10)),
        "Error: sumar 10 dias debe dar 11");
  }

  @Test
  void normalizarNoDebeSerNull() {
    assertNotNull(FechasPeriod15.normalizar(Period.ofMonths(12)), "Error: normalizar no debe devolver null");
  }
}
