package com.docencia.fechas.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class FechasLocalDate1Test {

  @Test
  void parseIsoDebeCrearFechaCorrecta() {
    assertEquals(LocalDate.of(2026, 1, 26), FechasLocalDate1.parseIso("2026-01-26"),
        "Error: parseIso debe devolver 2026-01-26");
  }

  @Test
  void formatIsoDebeGenerarTextoIso() {
    assertEquals("2026-01-26", FechasLocalDate1.formatIso(LocalDate.of(2026, 1, 26)),
        "Error: formatIso debe devolver texto ISO yyyy-MM-dd");
  }

  @Test
  void sumarDiasDebeAvanzarFecha() {
    assertEquals(LocalDate.of(2026, 2, 1), FechasLocalDate1.sumarDias(LocalDate.of(2026, 1, 26), 6),
        "Error: sumarDias debe sumar 6 dias");
  }

  @Test
  void sumarDiasDebeAceptarNegativos() {
    assertEquals(LocalDate.of(2026, 1, 20), FechasLocalDate1.sumarDias(LocalDate.of(2026, 1, 26), -6),
        "Error: sumarDias debe permitir restar dias");
  }

  @Test
  void parseIsoNoDebeSerNulo() {
    assertNotNull(FechasLocalDate1.parseIso("2026-01-26"), "Error: parseIso no debe devolver null");
  }
}
