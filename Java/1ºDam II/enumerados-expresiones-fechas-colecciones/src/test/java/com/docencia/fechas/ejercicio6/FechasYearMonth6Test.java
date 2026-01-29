package com.docencia.fechas.ejercicio6;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.YearMonth;
import org.junit.jupiter.api.Test;

class FechasYearMonth6Test {

  @Test
  void parseDebeCrearYearMonth() {
    assertEquals(YearMonth.of(2026, 1), FechasYearMonth6.parse("2026-01"), "Error: debe parsear 2026-01");
  }

  @Test
  void diasDelMesEneroDebeSer31() {
    assertEquals(31, FechasYearMonth6.diasDelMes(YearMonth.of(2026, 1)), "Error: enero debe tener 31 dias");
  }

  @Test
  void diasDelMesFebreroBisiestoDebeSer29() {
    assertEquals(29, FechasYearMonth6.diasDelMes(YearMonth.of(2024, 2)), "Error: feb 2024 debe tener 29 dias");
  }

  @Test
  void primerDiaDebeSerDia1() {
    assertEquals(LocalDate.of(2026, 1, 1), FechasYearMonth6.primerDia(YearMonth.of(2026, 1)),
        "Error: primerDia debe ser yyyy-mm-01");
  }

  @Test
  void primerDiaNoDebeSerNulo() {
    assertNotNull(FechasYearMonth6.primerDia(YearMonth.of(2026, 1)), "Error: primerDia no debe ser null");
  }
}
