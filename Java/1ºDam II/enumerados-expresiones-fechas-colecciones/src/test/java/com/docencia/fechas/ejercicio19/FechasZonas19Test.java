package com.docencia.fechas.ejercicio19;

import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import java.time.ZonedDateTime;
import org.junit.jupiter.api.Test;

class FechasZonas19Test {

  @Test
  void truncarAMinutoDebeQuitarSegundos() {
    ZonedDateTime z = FechasZonas19.crear(2026,1,26,10,5,"UTC").withSecond(59);
    assertEquals(0, FechasZonas19.truncarAMinuto(z).getSecond(), "Error: truncar debe dejar segundos en 0");
  }

  @Test
  void truncarAMinutoDebeQuitarNanos() {
    ZonedDateTime z = FechasZonas19.crear(2026,1,26,10,5,"UTC").withNano(123);
    assertEquals(0, FechasZonas19.truncarAMinuto(z).getNano(), "Error: truncar debe dejar nanos en 0");
  }

  @Test
  void diferenciaInstanteDebeSerCeroSiMismoInstante() {
    ZonedDateTime a = FechasZonas19.crear(2026,1,26,12,0,"UTC");
    ZonedDateTime b = a.withZoneSameInstant(java.time.ZoneId.of("Europe/Madrid"));
    assertEquals(Duration.ZERO, FechasZonas19.diferenciaInstante(a, b), "Error: mismo instante en distinta zona debe dar 0");
  }

  @Test
  void diferenciaInstanteDebeSerPositivaSiBEsPosterior() {
    ZonedDateTime a = FechasZonas19.crear(2026,1,26,12,0,"UTC");
    ZonedDateTime b = a.plusMinutes(10);
    assertEquals(600, FechasZonas19.diferenciaInstante(a, b).getSeconds(), "Error: 10 minutos son 600 segundos");
  }

  @Test
  void crearDebeTenerZonaCorrecta() {
    assertEquals("UTC", FechasZonas19.crear(2026,1,26,10,0,"UTC").getZone().getId(), "Error: zona debe ser UTC");
  }
}
