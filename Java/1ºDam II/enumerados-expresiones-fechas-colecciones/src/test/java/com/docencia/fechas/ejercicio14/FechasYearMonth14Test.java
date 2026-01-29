package com.docencia.fechas.ejercicio14;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.YearMonth;
import org.junit.jupiter.api.Test;

class FechasYearMonth14Test {

  @Test
  void ultimoDiaEneroDebeSer31() {
    assertEquals(LocalDate.of(2026,1,31), FechasYearMonth14.ultimoDia(YearMonth.of(2026,1)),
        "Error: ultimo dia de enero 2026 debe ser 31");
  }

  @Test
  void ultimoDiaFebreroBisiestoDebeSer29() {
    assertEquals(LocalDate.of(2024,2,29), FechasYearMonth14.ultimoDia(YearMonth.of(2024,2)),
        "Error: ultimo dia de feb 2024 debe ser 29");
  }

  @Test
  void esBisiestoDebeSerTrueEn2024() {
    assertTrue(FechasYearMonth14.esBisiesto(YearMonth.of(2024,1)), "Error: 2024 es bisiesto");
  }

  @Test
  void sumarMesesDebeAvanzar() {
    assertEquals(YearMonth.of(2026,3), FechasYearMonth14.sumarMeses(YearMonth.of(2026,1), 2),
        "Error: 2026-01 + 2 meses = 2026-03");
  }

  @Test
  void sumarMesesDebeAceptarNegativos() {
    assertEquals(YearMonth.of(2025,12), FechasYearMonth14.sumarMeses(YearMonth.of(2026,1), -1),
        "Error: 2026-01 - 1 mes = 2025-12");
  }
}
