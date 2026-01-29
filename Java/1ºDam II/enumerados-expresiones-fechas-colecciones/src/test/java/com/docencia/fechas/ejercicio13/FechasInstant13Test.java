package com.docencia.fechas.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import java.time.Instant;
import org.junit.jupiter.api.Test;

class FechasInstant13Test {

  @Test
  void sumarDebeAvanzar() {
    assertEquals(Instant.ofEpochSecond(10), FechasInstant13.sumar(Instant.ofEpochSecond(0), Duration.ofSeconds(10)),
        "Error: sumar 10s debe dar 10s");
  }

  @Test
  void expiradoDebeSerFalseAntesDeTtl() {
    Instant inicio = Instant.ofEpochSecond(0);
    assertFalse(FechasInstant13.expirado(inicio, Duration.ofSeconds(10), Instant.ofEpochSecond(9)),
        "Error: a los 9s no debe estar expirado con ttl 10s");
  }

  @Test
  void expiradoDebeSerTrueDespuesDeTtl() {
    Instant inicio = Instant.ofEpochSecond(0);
    assertTrue(FechasInstant13.expirado(inicio, Duration.ofSeconds(10), Instant.ofEpochSecond(11)),
        "Error: a los 11s debe estar expirado con ttl 10s");
  }

  @Test
  void millisDebeDevolverMilis() {
    assertEquals(1500, FechasInstant13.millis(Duration.ofMillis(1500)), "Error: 1500ms deben ser 1500");
  }

  @Test
  void expiradoDebeSerFalseSiIgualExacto() {
    Instant inicio = Instant.ofEpochSecond(0);
    assertFalse(FechasInstant13.expirado(inicio, Duration.ofSeconds(10), Instant.ofEpochSecond(10)),
        "Error: en el limite exacto no debe ser expirado (solo despues)");
  }
}
