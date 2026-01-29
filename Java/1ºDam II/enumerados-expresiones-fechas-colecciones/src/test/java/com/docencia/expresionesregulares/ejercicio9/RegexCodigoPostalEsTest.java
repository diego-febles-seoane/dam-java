package com.docencia.expresionesregulares.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RegexCodigoPostalEsTest {

  @Test
  void patronNoDebeSerNulo() {
    assertNotNull(RegexCodigoPostalEs.patron(), "Error: el patron no debe ser nulo");
  }


  @Test
  void debeAceptarCodigoPostal() {
    assertTrue(RegexCodigoPostalEs.esValido("28013"), "Error: 28013 debe ser valido");
  }

  @Test
  void debeRechazarProvincia00() {
    assertFalse(RegexCodigoPostalEs.esValido("00000"), "Error: provincia 00 no debe ser valida");
  }

  @Test
  void debeRechazarProvincia53() {
    assertFalse(RegexCodigoPostalEs.esValido("53000"), "Error: provincia 53 no debe ser valida");
  }

}
