package com.docencia.expresionesregulares.ejercicio6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RegexIpv4Test {

  @Test
  void patronNoDebeSerNulo() {
    assertNotNull(RegexIpv4.patron(), "Error: el patron no debe ser nulo");
  }


  @Test
  void debeAceptarIpv4() {
    assertTrue(RegexIpv4.esValido("192.168.1.1"), "Error: '192.168.1.1' debe ser valido");
  }

  @Test
  void debeRechazarOctetoAlto() {
    assertFalse(RegexIpv4.esValido("256.1.1.1"), "Error: 256 no debe ser valido");
  }

  @Test
  void debeRechazarFormato() {
    assertFalse(RegexIpv4.esValido("192.168.1"), "Error: faltan octetos");
  }

}
