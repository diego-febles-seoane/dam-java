package com.docencia.fechas.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import java.time.Instant;
import org.junit.jupiter.api.Test;

class FechasDuration8Test {

  @Test
  void entreDebeCalcularSegundos() {
    Duration d = FechasDuration8.entre(Instant.ofEpochSecond(0), Instant.ofEpochSecond(10));
    assertEquals(10, d.getSeconds(), "Error: entre 0 y 10 segundos debe ser 10s");
  }

  @Test
  void segundosDebeDevolverSegundos() {
    assertEquals(5, FechasDuration8.segundos(Duration.ofSeconds(5)), "Error: segundos debe devolver 5");
  }

  @Test
  void sumarDebeAvanzarInstant() {
    Instant i = FechasDuration8.sumar(Instant.ofEpochSecond(0), Duration.ofSeconds(3));
    assertEquals(Instant.ofEpochSecond(3), i, "Error: sumar 3s debe dar epochSecond 3");
  }

  @Test
  void entrePuedeSerNegativa() {
    Duration d = FechasDuration8.entre(Instant.ofEpochSecond(10), Instant.ofEpochSecond(0));
    assertEquals(-10, d.getSeconds(), "Error: entre 10 y 0 debe ser -10s");
  }

  @Test
  void entreNoDebeSerNula() {
    assertNotNull(FechasDuration8.entre(Instant.EPOCH, Instant.EPOCH), "Error: entre no debe devolver null");
  }
}
