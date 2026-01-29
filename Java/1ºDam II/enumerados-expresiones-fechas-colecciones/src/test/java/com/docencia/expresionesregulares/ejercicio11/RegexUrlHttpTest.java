package com.docencia.expresionesregulares.ejercicio11;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RegexUrlHttpTest {

  @Test
  void patronNoDebeSerNulo() {
    assertNotNull(RegexUrlHttp.patron(), "Error: el patron no debe ser nulo");
  }


  @Test
  void debeAceptarHttps() {
    assertTrue(RegexUrlHttp.esValido("https://example.com/ruta"), "Error: URL https valida no reconocida");
  }

  @Test
  void debeAceptarConPuerto() {
    assertTrue(RegexUrlHttp.esValido("http://localhost:8080/api"), "Error: URL con puerto debe ser valida");
  }

  @Test
  void debeRechazarSinProtocolo() {
    assertFalse(RegexUrlHttp.esValido("example.com"), "Error: sin protocolo no debe ser valido");
  }

}
