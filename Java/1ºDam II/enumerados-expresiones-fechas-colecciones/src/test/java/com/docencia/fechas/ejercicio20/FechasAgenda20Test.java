package com.docencia.fechas.ejercicio20;

import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import org.junit.jupiter.api.Test;

class FechasAgenda20Test {

  @Test
  void proximaRevisionDebeSumarPeriodo() {
    LocalDateTime u = LocalDateTime.of(2026,1,1,10,0);
    assertEquals(LocalDateTime.of(2026,2,1,10,0), FechasAgenda20.proximaRevision(u, Period.ofMonths(1)),
        "Error: sumar 1 mes debe llevar al 1 de febrero");
  }

  @Test
  void sumarDuracionDebeSumarHoras() {
    LocalDateTime u = LocalDateTime.of(2026,1,1,10,0);
    assertEquals(LocalDateTime.of(2026,1,1,12,30), FechasAgenda20.sumarDuracion(u, Duration.ofMinutes(150)),
        "Error: 150 minutos son 2h30");
  }

  @Test
  void estaDentroVentanaDebeSerTrueEnLimiteSuperior() {
    LocalDateTime base = LocalDateTime.of(2026,1,1,10,0);
    assertTrue(FechasAgenda20.estaDentroVentana(base, base.plusMinutes(10), Duration.ofMinutes(10)),
        "Error: el limite superior debe considerarse dentro");
  }

  @Test
  void estaDentroVentanaDebeSerFalseAntes() {
    LocalDateTime base = LocalDateTime.of(2026,1,1,10,0);
    assertFalse(FechasAgenda20.estaDentroVentana(base, base.minusSeconds(1), Duration.ofMinutes(10)),
        "Error: un instante anterior no debe estar dentro");
  }

  @Test
  void estaDentroVentanaDebeSerFalseDespues() {
    LocalDateTime base = LocalDateTime.of(2026,1,1,10,0);
    assertFalse(FechasAgenda20.estaDentroVentana(base, base.plusMinutes(11), Duration.ofMinutes(10)),
        "Error: fuera de ventana no debe estar dentro");
  }
}
