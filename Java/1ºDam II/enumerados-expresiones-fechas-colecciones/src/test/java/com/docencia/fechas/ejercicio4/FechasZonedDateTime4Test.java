package com.docencia.fechas.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import org.junit.jupiter.api.Test;

class FechasZonedDateTime4Test {

  @Test
  void enZonaDebeCambiarZona() {
    ZonedDateTime z = ZonedDateTime.of(2026,1,26,12,0,0,0, ZoneId.of("UTC"));
    ZonedDateTime x = FechasZonedDateTime4.enZona(z, "Europe/Madrid");
    assertEquals("Europe/Madrid", FechasZonedDateTime4.zonaId(x), "Error: debe cambiar a Europe/Madrid");
  }

  @Test
  void enZonaDebeMantenerInstante() {
    ZonedDateTime z = ZonedDateTime.of(2026,1,26,12,0,0,0, ZoneId.of("UTC"));
    ZonedDateTime x = FechasZonedDateTime4.enZona(z, "Europe/Madrid");
    assertEquals(z.toInstant(), x.toInstant(), "Error: withZoneSameInstant debe mantener el mismo instante");
  }

  @Test
  void horaEnZonaDebeSerDistintaSegunZona() {
    ZonedDateTime z = ZonedDateTime.of(2026,1,26,12,0,0,0, ZoneId.of("UTC"));
    int hUtc = FechasZonedDateTime4.horaEnZona(z, "UTC");
    int hMadrid = FechasZonedDateTime4.horaEnZona(z, "Europe/Madrid");
    assertNotEquals(hUtc, hMadrid, "Error: la hora debe variar segun zona (normalmente UTC vs Madrid)");
  }

  @Test
  void zonaIdDebeDevolverId() {
    ZonedDateTime z = ZonedDateTime.now(ZoneId.of("UTC"));
    assertEquals("UTC", FechasZonedDateTime4.zonaId(z), "Error: zonaId debe devolver 'UTC'");
  }

  @Test
  void enZonaNoDebeSerNulo() {
    ZonedDateTime z = ZonedDateTime.now(ZoneId.of("UTC"));
    assertNotNull(FechasZonedDateTime4.enZona(z, "UTC"), "Error: enZona no debe devolver null");
  }
}
