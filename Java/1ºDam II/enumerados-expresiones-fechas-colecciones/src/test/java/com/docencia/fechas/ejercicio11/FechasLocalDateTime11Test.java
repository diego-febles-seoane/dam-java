package com.docencia.fechas.ejercicio11;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;

class FechasLocalDateTime11Test {

  @Test
  void fechaDebeExtraerLocalDate() {
    assertEquals(LocalDate.of(2026,1,26), FechasLocalDateTime11.fecha(LocalDateTime.of(2026,1,26,10,0)),
        "Error: fecha debe extraer la parte LocalDate");
  }

  @Test
  void horaDebeExtraerLocalTime() {
    assertEquals(LocalTime.of(10,0), FechasLocalDateTime11.hora(LocalDateTime.of(2026,1,26,10,0,3)),
        "Error: hora debe ignorar segundos y nanos en este ejercicio");
  }

  @Test
  void esMismoDiaDebeSerTrue() {
    assertTrue(FechasLocalDateTime11.esMismoDia(LocalDateTime.of(2026,1,1,0,0), LocalDateTime.of(2026,1,1,23,59)),
        "Error: debe ser el mismo dia aunque cambie la hora");
  }

  @Test
  void esMismoDiaDebeSerFalse() {
    assertFalse(FechasLocalDateTime11.esMismoDia(LocalDateTime.of(2026,1,1,23,59), LocalDateTime.of(2026,1,2,0,0)),
        "Error: dias distintos deben devolver false");
  }

  @Test
  void horaNoDebeTenerNanos() {
    assertEquals(0, FechasLocalDateTime11.hora(LocalDateTime.of(2026,1,1,0,0,0,999)).getNano(),
        "Error: hora debe devolver nanos=0");
  }
}
