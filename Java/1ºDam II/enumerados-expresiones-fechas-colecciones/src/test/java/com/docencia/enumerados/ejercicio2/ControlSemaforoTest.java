package com.docencia.enumerados.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ControlSemaforoTest {

  @Test
  void debeTenerTresColores() {
    assertEquals(3, ColorSemaforo.values().length, "Error: ColorSemaforo debe tener 3 valores");
  }

  @Test
  void debeContenerRojo() {
    assertEquals(ColorSemaforo.Rojo, ColorSemaforo.valueOf("Rojo"), "Error: falta Rojo en ColorSemaforo");
  }

  @Test
  void puedeAvanzarDebeSerTrueEnVerde() {
    ControlSemaforo c = new ControlSemaforo();
    assertTrue(c.puedeAvanzar(ColorSemaforo.Verde), "Error: en Verde se debe poder avanzar");
  }

  @Test
  void siguienteColorDebeSerAmbarDespuesDeVerde() {
    ControlSemaforo c = new ControlSemaforo();
    assertEquals(ColorSemaforo.Ambar, c.siguienteColor(ColorSemaforo.Verde), "Error: Verde debe pasar a Ambar");
  }

  @Test
  void segundosHastaCambioDebeSerCincoEnAmbar() {
    ControlSemaforo c = new ControlSemaforo();
    assertEquals(5, c.segundosHastaCambio(ColorSemaforo.Ambar), "Error: Ambar debe durar 5 segundos");
  }
}
