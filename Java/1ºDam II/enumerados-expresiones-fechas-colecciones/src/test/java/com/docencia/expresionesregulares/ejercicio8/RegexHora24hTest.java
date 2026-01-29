package com.docencia.expresionesregulares.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RegexHora24hTest {

  @Test
  void patronNoDebeSerNulo() {
    assertNotNull(RegexHora24h.patron(), "Error: el patron no debe ser nulo");
  }


  @Test
  void debeAceptarHora() {
    assertTrue(RegexHora24h.esValido("23:59"), "Error: '23:59' debe ser valido");
  }

  @Test
  void debeRechazarHora24() {
    assertFalse(RegexHora24h.esValido("24:00"), "Error: 24:00 no debe ser valido");
  }

  @Test
  void debeRechazarMinutos60() {
    assertFalse(RegexHora24h.esValido("10:60"), "Error: 10:60 no debe ser valido");
  }

}
