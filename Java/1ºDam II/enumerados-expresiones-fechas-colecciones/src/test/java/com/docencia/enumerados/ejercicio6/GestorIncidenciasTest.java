package com.docencia.enumerados.ejercicio6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GestorIncidenciasTest {

  @Test
  void debeTenerTresPrioridades() {
    assertEquals(3, Prioridad.values().length, "Error: Prioridad debe tener 3 valores");
  }

  @Test
  void esCriticaDebeSerTrueParaAlta() {
    GestorIncidencias g = new GestorIncidencias();
    assertTrue(g.esCritica(Prioridad.Alta), "Error: Alta debe ser critica");
  }

  @Test
  void tiempoAltaDebeSerMenorQueMedia() {
    GestorIncidencias g = new GestorIncidencias();
    assertTrue(g.tiempoRespuestaMinutos(Prioridad.Alta) < g.tiempoRespuestaMinutos(Prioridad.Media),
        "Error: Alta debe responder antes que Media");
  }

  @Test
  void compararDebeDarPositivoCuandoAEsMasAlta() {
    GestorIncidencias g = new GestorIncidencias();
    assertTrue(g.comparar(Prioridad.Alta, Prioridad.Baja) > 0, "Error: Alta debe ser mayor que Baja");
  }

  @Test
  void debeContenerBaja() {
    assertEquals(Prioridad.Baja, Prioridad.valueOf("Baja"), "Error: falta Baja en Prioridad");
  }
}
