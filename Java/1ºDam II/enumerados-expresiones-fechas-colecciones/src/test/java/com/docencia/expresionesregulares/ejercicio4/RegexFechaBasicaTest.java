package com.docencia.expresionesregulares.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RegexFechaBasicaTest {

  @Test
  void patronNoDebeSerNulo() {
    assertNotNull(RegexFechaBasica.patron(), "Error: el patron no debe ser nulo");
  }


  @Test
  void debeAceptarFecha() {
    assertTrue(RegexFechaBasica.esValido("31/12/2025"), "Error: '31/12/2025' debe ser valido");
  }

  @Test
  void debeRechazarDiaCero() {
    assertFalse(RegexFechaBasica.esValido("00/12/2025"), "Error: dia 00 no debe ser valido");
  }

  @Test
  void debeRechazarMes13() {
    assertFalse(RegexFechaBasica.esValido("10/13/2025"), "Error: mes 13 no debe ser valido");
  }

}
