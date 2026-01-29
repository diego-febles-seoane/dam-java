package com.docencia.enumerados.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalendarioTest {

  @Test
  void debeTenerSieteDias() {
    assertEquals(7, DiaSemana.values().length, "Error: DiaSemana debe tener 7 valores");
  }

  @Test
  void debeContenerSabado() {
    assertEquals(DiaSemana.Sabado, DiaSemana.valueOf("Sabado"), "Error: falta Sabado en DiaSemana");
  }

  @Test
  void isFinDeSemanaDebeSerTrueEnDomingo() {
    Calendario c = new Calendario();
    assertTrue(c.isFinDeSemana(DiaSemana.Domingo), "Error: Domingo debe ser fin de semana");
  }

  @Test
  void siguienteDiaDebePasarDeDomingoALunes() {
    Calendario c = new Calendario();
    assertEquals(DiaSemana.Lunes, c.siguienteDia(DiaSemana.Domingo), "Error: Domingo debe pasar a Lunes");
  }

  @Test
  void numeroIsoDebeSerCincoParaViernes() {
    Calendario c = new Calendario();
    assertEquals(5, c.numeroIso(DiaSemana.Viernes), "Error: Viernes debe ser ISO 5");
  }
}
