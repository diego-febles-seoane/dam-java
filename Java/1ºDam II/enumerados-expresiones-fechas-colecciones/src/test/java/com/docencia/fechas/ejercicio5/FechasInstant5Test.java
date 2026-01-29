package com.docencia.fechas.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;
import java.time.Instant;
import org.junit.jupiter.api.Test;

class FechasInstant5Test {

  @Test
  void desdeEpochMillisDebeCrearInstant() {
    Instant i = FechasInstant5.desdeEpochMillis(0);
    assertEquals(Instant.EPOCH, i, "Error: epoch millis 0 debe ser Instant.EPOCH");
  }

  @Test
  void aEpochMillisDebeVolverACero() {
    assertEquals(0L, FechasInstant5.aEpochMillis(Instant.EPOCH), "Error: Instant.EPOCH debe ser 0 ms");
  }

  @Test
  void esPosteriorDebeDetectarOrden() {
    Instant a = Instant.ofEpochSecond(2);
    Instant b = Instant.ofEpochSecond(1);
    assertTrue(FechasInstant5.esPosterior(a, b), "Error: 2s debe ser posterior a 1s");
  }

  @Test
  void esPosteriorDebeSerFalseSiIgual() {
    Instant a = Instant.ofEpochSecond(1);
    assertFalse(FechasInstant5.esPosterior(a, a), "Error: si son iguales no es posterior");
  }

  @Test
  void desdeEpochMillisNoDebeSerNulo() {
    assertNotNull(FechasInstant5.desdeEpochMillis(1), "Error: desdeEpochMillis no debe devolver null");
  }
}
