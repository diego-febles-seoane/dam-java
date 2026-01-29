package com.docencia.enumerados.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EnvioServiceTest {

  @Test
  void debeTenerTresTipos() {
    assertEquals(3, TipoEnvio.values().length, "Error: TipoEnvio debe tener 3 valores");
  }

  @Test
  void recogidaDebeCostarCero() {
    EnvioService s = new EnvioService();
    assertEquals(0, s.coste(TipoEnvio.Recogida), "Error: Recogida debe costar 0");
  }

  @Test
  void expressDebeSerRapido() {
    EnvioService s = new EnvioService();
    assertTrue(s.esRapido(TipoEnvio.Express), "Error: Express debe considerarse rapido");
  }

  @Test
  void estandarDebeTardarTresDias() {
    EnvioService s = new EnvioService();
    assertEquals(3, s.diasEntrega(TipoEnvio.Estandar), "Error: Estandar debe tardar 3 dias");
  }

  @Test
  void debeContenerExpress() {
    assertEquals(TipoEnvio.Express, TipoEnvio.valueOf("Express"), "Error: falta Express en TipoEnvio");
  }
}
