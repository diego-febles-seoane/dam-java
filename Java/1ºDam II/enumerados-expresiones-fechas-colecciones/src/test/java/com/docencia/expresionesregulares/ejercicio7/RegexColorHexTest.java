package com.docencia.expresionesregulares.ejercicio7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RegexColorHexTest {

  @Test
  void patronNoDebeSerNulo() {
    assertNotNull(RegexColorHex.patron(), "Error: el patron no debe ser nulo");
  }


  @Test
  void debeAceptarHex() {
    assertTrue(RegexColorHex.esValido("#1a2B3c"), "Error: color hex valido no reconocido");
  }

  @Test
  void debeRechazarSinAlmohadilla() {
    assertFalse(RegexColorHex.esValido("1a2b3c"), "Error: sin # no debe ser valido");
  }

  @Test
  void debeRechazarLongitudIncorrecta() {
    assertFalse(RegexColorHex.esValido("#123"), "Error: #123 no debe ser valido en este ejercicio");
  }

}
