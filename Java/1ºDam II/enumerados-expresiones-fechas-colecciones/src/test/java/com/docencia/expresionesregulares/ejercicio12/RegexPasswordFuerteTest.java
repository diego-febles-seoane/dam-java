package com.docencia.expresionesregulares.ejercicio12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RegexPasswordFuerteTest {

  @Test
  void patronNoDebeSerNulo() {
    assertNotNull(RegexPasswordFuerte.patron(), "Error: el patron no debe ser nulo");
  }


  @Test
  void debeAceptarPasswordFuerte() {
    assertTrue(RegexPasswordFuerte.esValido("Abcdef1!"), "Error: password fuerte no reconocida");
  }

  @Test
  void debeRechazarSinMayuscula() {
    assertFalse(RegexPasswordFuerte.esValido("abcdef1!"), "Error: sin mayuscula no debe ser valido");
  }

  @Test
  void debeRechazarCorta() {
    assertFalse(RegexPasswordFuerte.esValido("Ab1!"), "Error: longitud menor de 8 no debe ser valida");
  }

}
