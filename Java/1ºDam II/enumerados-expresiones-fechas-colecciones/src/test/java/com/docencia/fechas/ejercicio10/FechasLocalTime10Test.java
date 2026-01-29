package com.docencia.fechas.ejercicio10;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;

class FechasLocalTime10Test {

  @Test
  void minutosEntreDebeSerTreinta() {
    assertEquals(30, FechasLocalTime10.minutosEntre(LocalTime.of(9,0), LocalTime.of(9,30)),
        "Error: entre 09:00 y 09:30 hay 30 minutos");
  }

  @Test
  void minutosEntrePuedeSerNegativo() {
    assertEquals(-30, FechasLocalTime10.minutosEntre(LocalTime.of(9,30), LocalTime.of(9,0)),
        "Error: el orden invertido debe dar negativo");
  }

  @Test
  void esAntesDebeSerTrue() {
    assertTrue(FechasLocalTime10.esAntes(LocalTime.of(9,0), LocalTime.of(9,1)), "Error: 09:00 es antes que 09:01");
  }

  @Test
  void truncarMinutosDebeQuitarSegundos() {
    assertEquals(LocalTime.of(10,5,0), FechasLocalTime10.truncarMinutos(LocalTime.of(10,5,59)),
        "Error: truncarMinutos debe dejar segundos a 0");
  }

  @Test
  void truncarMinutosDebeQuitarNanos() {
    assertEquals(0, FechasLocalTime10.truncarMinutos(LocalTime.of(10,5,0,123)).getNano(),
        "Error: truncarMinutos debe dejar nanos a 0");
  }
}
