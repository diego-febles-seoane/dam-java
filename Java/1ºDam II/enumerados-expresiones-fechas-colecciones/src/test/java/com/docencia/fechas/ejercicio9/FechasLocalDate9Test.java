package com.docencia.fechas.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class FechasLocalDate9Test {

  @Test
  void diaSemanaDebeSerMonday() {
    assertEquals(DayOfWeek.MONDAY, FechasLocalDate9.diaSemana(LocalDate.of(2026, 1, 26)),
        "Error: 2026-01-26 es lunes");
  }

  @Test
  void esFinDeSemanaDebeSerFalseEnLunes() {
    assertFalse(FechasLocalDate9.esFinDeSemana(LocalDate.of(2026,1,26)), "Error: lunes no es fin de semana");
  }

  @Test
  void esFinDeSemanaDebeSerTrueEnDomingo() {
    assertTrue(FechasLocalDate9.esFinDeSemana(LocalDate.of(2026,2,1)), "Error: domingo debe ser fin de semana");
  }

  @Test
  void siguienteLunesDebeDevolverMismoSiYaEsLunes() {
    LocalDate d = LocalDate.of(2026,1,26);
    assertEquals(d, FechasLocalDate9.siguienteLunes(d), "Error: si ya es lunes debe devolver el mismo dia");
  }

  @Test
  void siguienteLunesDebeAvanzarDesdeMartes() {
    LocalDate d = LocalDate.of(2026,1,27); // martes
    assertEquals(LocalDate.of(2026,2,2), FechasLocalDate9.siguienteLunes(d), "Error: siguiente lunes desde martes debe avanzar");
  }
}
