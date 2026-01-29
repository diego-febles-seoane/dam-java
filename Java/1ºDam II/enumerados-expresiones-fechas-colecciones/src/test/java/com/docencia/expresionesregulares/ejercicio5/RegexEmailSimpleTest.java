package com.docencia.expresionesregulares.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RegexEmailSimpleTest {

  @Test
  void patronNoDebeSerNulo() {
    assertNotNull(RegexEmailSimple.patron(), "Error: el patron no debe ser nulo");
  }


  @Test
  void debeAceptarEmail() {
    assertTrue(RegexEmailSimple.esValido("alumno.test+1@ejemplo.com"), "Error: email valido no reconocido");
  }

  @Test
  void debeRechazarSinArroba() {
    assertFalse(RegexEmailSimple.esValido("alumno.ejemplo.com"), "Error: email sin arroba no debe ser valido");
  }

  @Test
  void debeRechazarTldCorta() {
    assertFalse(RegexEmailSimple.esValido("a@b.c"), "Error: TLD de 1 letra no debe ser valido");
  }

}
