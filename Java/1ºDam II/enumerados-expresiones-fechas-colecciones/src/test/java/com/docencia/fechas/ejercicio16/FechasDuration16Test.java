package com.docencia.fechas.ejercicio16;

import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

class FechasDuration16Test {

  @Test
  void parseIsoDebeLeerHoras() {
    assertEquals(Duration.ofHours(2), FechasDuration16.parseIso("PT2H"), "Error: PT2H debe ser 2 horas");
  }

  @Test
  void sumarDebeAvanzarLocalDateTime() {
    LocalDateTime dt = LocalDateTime.of(2026,1,1,10,0);
    assertEquals(LocalDateTime.of(2026,1,1,12,0), FechasDuration16.sumar(dt, Duration.ofHours(2)),
        "Error: sumar 2 horas debe avanzar la hora");
  }

  @Test
  void minutosDebeDevolverMinutos() {
    assertEquals(90, FechasDuration16.minutos(Duration.ofMinutes(90)), "Error: 90 minutos deben ser 90");
  }

  @Test
  void parseIsoDebeAceptarMinutos() {
    assertEquals(Duration.ofMinutes(30), FechasDuration16.parseIso("PT30M"), "Error: PT30M debe ser 30 minutos");
  }

  @Test
  void parseIsoNoDebeSerNull() {
    assertNotNull(FechasDuration16.parseIso("PT0S"), "Error: parseIso no debe devolver null");
  }
}
