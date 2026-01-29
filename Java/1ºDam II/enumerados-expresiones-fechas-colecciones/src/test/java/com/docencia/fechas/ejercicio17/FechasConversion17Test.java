package com.docencia.fechas.ejercicio17;

import static org.junit.jupiter.api.Assertions.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import org.junit.jupiter.api.Test;

class FechasConversion17Test {

  @Test
  void aInstantDebeSerConsistente() {
    LocalDateTime dt = LocalDateTime.of(1970,1,1,0,0);
    assertEquals(Instant.EPOCH, FechasConversion17.aInstant(dt, "UTC"), "Error: 1970-01-01T00:00 UTC debe ser epoch");
  }

  @Test
  void aZonedDebeTenerZona() {
    LocalDateTime dt = LocalDateTime.of(2026,1,26,10,0);
    assertEquals("UTC", FechasConversion17.aZoned(dt, "UTC").getZone().getId(), "Error: zona debe ser UTC");
  }

  @Test
  void deInstantDebeVolverALocalDateTime() {
    LocalDateTime dt = FechasConversion17.deInstant(Instant.EPOCH, "UTC");
    assertEquals(LocalDateTime.of(1970,1,1,0,0), dt, "Error: epoch en UTC debe ser 1970-01-01T00:00");
  }

  @Test
  void aInstantDebeCambiarConZona() {
    LocalDateTime dt = LocalDateTime.of(2026,1,26,10,0);
    assertNotEquals(FechasConversion17.aInstant(dt, "UTC"), FechasConversion17.aInstant(dt, "Europe/Madrid"),
        "Error: el instant debe diferir si cambia la zona para el mismo LocalDateTime");
  }

  @Test
  void deInstantNoDebeSerNull() {
    assertNotNull(FechasConversion17.deInstant(Instant.EPOCH, "UTC"), "Error: deInstant no debe devolver null");
  }
}
