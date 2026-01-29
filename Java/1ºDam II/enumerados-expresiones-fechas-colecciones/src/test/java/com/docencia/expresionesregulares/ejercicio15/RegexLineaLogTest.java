package com.docencia.expresionesregulares.ejercicio15;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RegexLineaLogTest {

  @Test
  void patronNoDebeSerNulo() {
    assertNotNull(RegexLineaLog.patron(), "Error: el patron no debe ser nulo");
  }

  @Test
  void debeAceptarLineaValida() {
    String l = "2026-01-25 INFO Usuario=ana Accion=login";
    assertTrue(RegexLineaLog.esValida(l), "Error: la linea debe ser valida");
  }

  @Test
  void debeExtraerNivel() {
    String l = "2026-01-25 ERROR Usuario=ana Accion=login";
    assertEquals("ERROR", RegexLineaLog.nivel(l), "Error: debe extraer nivel ERROR");
  }

  @Test
  void debeExtraerUsuario() {
    String l = "2026-01-25 INFO Usuario=juan_1 Accion=logout";
    assertEquals("juan_1", RegexLineaLog.usuario(l), "Error: debe extraer usuario juan_1");
  }

  @Test
  void debeDevolverNullSiNoCoincide() {
    assertNull(RegexLineaLog.usuario("linea invalida"), "Error: si no coincide debe devolver null");
  }
}
