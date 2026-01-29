package com.docencia.expresionesregulares.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RegexSoloDigitosTest {

  @Test
  void patronNoDebeSerNulo() {
    assertNotNull(RegexSoloDigitos.patron(), "Error: el patron no debe ser nulo");
  }


  @Test
  void debeAceptarDigitos() {
    assertTrue(RegexSoloDigitos.esValido("12345"), "Error: '12345' debe ser valido");
  }

  @Test
  void debeRechazarVacio() {
    assertFalse(RegexSoloDigitos.esValido(""), "Error: cadena vacia no debe ser valida");
  }

  @Test
  void debeRechazarLetras() {
    assertFalse(RegexSoloDigitos.esValido("12a3"), "Error: '12a3' no debe ser valido");
  }

}
