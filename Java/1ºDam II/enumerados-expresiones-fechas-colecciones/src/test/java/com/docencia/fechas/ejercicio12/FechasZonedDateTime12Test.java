package com.docencia.fechas.ejercicio12;

import static org.junit.jupiter.api.Assertions.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import org.junit.jupiter.api.Test;

class FechasZonedDateTime12Test {

  @Test
  void ahoraEnNoDebeSerNull() {
    assertNotNull(FechasZonedDateTime12.ahoraEn("UTC"), "Error: ahoraEn debe devolver un ZonedDateTime");
  }

  @Test
  void cambiarZonaDebeMantenerInstante() {
    ZonedDateTime z = ZonedDateTime.of(2026,1,26,12,0,0,0, ZoneId.of("UTC"));
    ZonedDateTime x = FechasZonedDateTime12.cambiarZona(z, "Europe/London");
    assertEquals(z.toInstant(), x.toInstant(), "Error: cambiarZona debe mantener el instante");
  }

  @Test
  void offsetHorasUtcDebeSerCero() {
    ZonedDateTime z = ZonedDateTime.of(2026,1,26,12,0,0,0, ZoneId.of("UTC"));
    assertEquals(0, FechasZonedDateTime12.offsetHoras(z), "Error: UTC debe tener offset 0 horas");
  }

  @Test
  void cambiarZonaDebeCambiarZoneId() {
    ZonedDateTime z = ZonedDateTime.of(2026,1,26,12,0,0,0, ZoneId.of("UTC"));
    ZonedDateTime x = FechasZonedDateTime12.cambiarZona(z, "Europe/Madrid");
    assertEquals("Europe/Madrid", x.getZone().getId(), "Error: debe cambiar a Europe/Madrid");
  }

  @Test
  void offsetHorasDebeSerConsistenteConOffset() {
    ZonedDateTime z = ZonedDateTime.of(2026,1,26,12,0,0,0, ZoneId.of("UTC"));
    assertEquals(z.getOffset().getTotalSeconds()/3600, FechasZonedDateTime12.offsetHoras(z),
        "Error: offsetHoras debe corresponder con getOffset()");
  }
}
