package com.docencia.expresionesregulares.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RegexPalabraRepetidaTest {

  @Test
  void patronNoDebeSerNulo() {
    assertNotNull(RegexPalabraRepetida.patron(), "Error: el patron no debe ser nulo");
  }

  @Test
  void debeDetectarRepeticion() {
    assertTrue(RegexPalabraRepetida.contieneRepeticion("hola hola mundo"), "Error: debe detectar 'hola hola'");
  }

  @Test
  void noDebeDetectarSiNoHayRepeticion() {
    assertFalse(RegexPalabraRepetida.contieneRepeticion("hola mundo hola"), "Error: no hay repeticion consecutiva");
  }

  @Test
  void primeraRepetidaDebeDevolverPalabra() {
    assertEquals("hola", RegexPalabraRepetida.primeraRepetida("hola hola mundo"), "Error: debe devolver 'hola'");
  }

  @Test
  void primeraRepetidaDebeSerNullSiNoHay() {
    assertNull(RegexPalabraRepetida.primeraRepetida("uno dos tres"), "Error: debe devolver null si no hay repeticion");
  }
}
