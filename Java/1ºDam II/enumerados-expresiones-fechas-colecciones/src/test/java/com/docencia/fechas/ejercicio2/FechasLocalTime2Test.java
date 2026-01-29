package com.docencia.fechas.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;

class FechasLocalTime2Test {

  @Test
  void parseHoraDebeCrearHoraCorrecta() {
    assertEquals(LocalTime.of(9, 30), FechasLocalTime2.parseHora("09:30"),
        "Error: parseHora debe devolver 09:30");
  }

  @Test
  void formatHoraDebeDevolverHHmm() {
    assertEquals("09:30", FechasLocalTime2.formatHora(LocalTime.of(9, 30)),
        "Error: formatHora debe devolver HH:mm");
  }

  @Test
  void sumarMinutosDebeCambiarHora() {
    assertEquals(LocalTime.of(10, 0), FechasLocalTime2.sumarMinutos(LocalTime.of(9, 30), 30),
        "Error: sumarMinutos debe sumar 30 minutos");
  }

  @Test
  void sumarMinutosDebeHacerWrapDia() {
    assertEquals(LocalTime.of(0, 10), FechasLocalTime2.sumarMinutos(LocalTime.of(23, 50), 20),
        "Error: sumarMinutos debe envolver a dia siguiente");
  }

  @Test
  void parseHoraNoDebeSerNulo() {
    assertNotNull(FechasLocalTime2.parseHora("00:00"), "Error: parseHora no debe devolver null");
  }
}
