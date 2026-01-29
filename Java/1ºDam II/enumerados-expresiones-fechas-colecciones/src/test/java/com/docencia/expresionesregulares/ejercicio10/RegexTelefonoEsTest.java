package com.docencia.expresionesregulares.ejercicio10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RegexTelefonoEsTest {

  @Test
  void patronNoDebeSerNulo() {
    assertNotNull(RegexTelefonoEs.patron(), "Error: el patron no debe ser nulo");
  }


  @Test
  void debeAceptarConPrefijo() {
    assertTrue(RegexTelefonoEs.esValido("+34 600 123 123"), "Error: telefono con prefijo debe ser valido");
  }

  @Test
  void debeAceptarSinEspacios() {
    assertTrue(RegexTelefonoEs.esValido("600123123"), "Error: telefono sin espacios debe ser valido");
  }

  @Test
  void debeRechazarInicioIncorrecto() {
    assertFalse(RegexTelefonoEs.esValido("500123123"), "Error: telefono no debe empezar por 5 en este ejercicio");
  }

}
