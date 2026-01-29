package com.docencia.expresionesregulares.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RegexPalabraMinusculasTest {

  @Test
  void patronNoDebeSerNulo() {
    assertNotNull(RegexPalabraMinusculas.patron(), "Error: el patron no debe ser nulo");
  }


  @Test
  void debeAceptarPalabra() {
    assertTrue(RegexPalabraMinusculas.esValido("casa"), "Error: 'casa' debe ser valido");
  }

  @Test
  void debeRechazarMayusculas() {
    assertFalse(RegexPalabraMinusculas.esValido("Casa"), "Error: 'Casa' no debe ser valido");
  }

  @Test
  void debeRechazarCorta() {
    assertFalse(RegexPalabraMinusculas.esValido("ab"), "Error: palabra de 2 letras no debe ser valida");
  }

}
