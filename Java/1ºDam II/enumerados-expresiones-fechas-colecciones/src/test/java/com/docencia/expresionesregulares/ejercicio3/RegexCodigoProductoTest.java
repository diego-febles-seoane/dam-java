package com.docencia.expresionesregulares.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RegexCodigoProductoTest {

  @Test
  void patronNoDebeSerNulo() {
    assertNotNull(RegexCodigoProducto.patron(), "Error: el patron no debe ser nulo");
  }


  @Test
  void debeAceptarFormato() {
    assertTrue(RegexCodigoProducto.esValido("ABC-1234"), "Error: 'ABC-1234' debe ser valido");
  }

  @Test
  void debeRechazarSinGuion() {
    assertFalse(RegexCodigoProducto.esValido("ABC1234"), "Error: sin guion no debe ser valido");
  }

  @Test
  void debeRechazarLetrasMinusculas() {
    assertFalse(RegexCodigoProducto.esValido("AbC-1234"), "Error: debe ser todo mayusculas");
  }

}
