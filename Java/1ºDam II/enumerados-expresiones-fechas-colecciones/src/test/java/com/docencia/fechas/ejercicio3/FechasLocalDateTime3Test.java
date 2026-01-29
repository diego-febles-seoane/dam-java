package com.docencia.fechas.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;

class FechasLocalDateTime3Test {

  @Test
  void combinarDebeCrearLocalDateTime() {
    LocalDateTime dt = FechasLocalDateTime3.combinar(LocalDate.of(2026, 1, 26), LocalTime.of(8, 15));
    assertEquals(LocalDateTime.of(2026, 1, 26, 8, 15), dt, "Error: combinar debe crear fecha y hora correctas");
  }

  @Test
  void sumarHorasDebeAvanzar() {
    LocalDateTime dt = LocalDateTime.of(2026, 1, 26, 8, 0);
    assertEquals(LocalDateTime.of(2026, 1, 26, 10, 0), FechasLocalDateTime3.sumarHoras(dt, 2),
        "Error: sumarHoras debe sumar 2 horas");
  }

  @Test
  void sumarHorasDebeCambiarDia() {
    LocalDateTime dt = LocalDateTime.of(2026, 1, 26, 23, 0);
    assertEquals(LocalDateTime.of(2026, 1, 27, 1, 0), FechasLocalDateTime3.sumarHoras(dt, 2),
        "Error: sumarHoras debe pasar al dia siguiente");
  }

  @Test
  void esAntesDebeDetectarOrden() {
    assertTrue(FechasLocalDateTime3.esAntes(LocalDateTime.of(2026,1,1,0,0), LocalDateTime.of(2026,1,1,0,1)),
        "Error: esAntes debe ser true cuando a es anterior");
  }

  @Test
  void esAntesDebeSerFalseSiIgual() {
    LocalDateTime dt = LocalDateTime.of(2026,1,1,0,0);
    assertFalse(FechasLocalDateTime3.esAntes(dt, dt), "Error: esAntes debe ser false si son iguales");
  }
}
