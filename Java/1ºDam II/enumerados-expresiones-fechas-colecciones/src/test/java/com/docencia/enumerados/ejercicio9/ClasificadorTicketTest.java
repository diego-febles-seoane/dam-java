package com.docencia.enumerados.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ClasificadorTicketTest {

  @Test
  void debeTenerCuatroTipos() {
    assertEquals(4, TipoTicket.values().length, "Error: TipoTicket debe tener 4 valores");
  }

  @Test
  void requiereGuardiaDebeSerTrueParaCaidaServicio() {
    ClasificadorTicket c = new ClasificadorTicket();
    assertTrue(c.requiereGuardia(TipoTicket.CaidaServicio), "Error: CaidaServicio debe requerir guardia");
  }

  @Test
  void tiempoObjetivoDebeSerUnoParaCaidaServicio() {
    ClasificadorTicket c = new ClasificadorTicket();
    assertEquals(1, c.tiempoObjetivoHoras(TipoTicket.CaidaServicio),
        "Error: CaidaServicio debe tener objetivo de 1 hora");
  }

  @Test
  void esTecnicoDebeSerFalseParaConsulta() {
    ClasificadorTicket c = new ClasificadorTicket();
    assertFalse(c.esTecnico(TipoTicket.Consulta), "Error: Consulta no debe ser tecnico");
  }

  @Test
  void debeContenerUrgente() {
    assertEquals(TipoTicket.Urgente, TipoTicket.valueOf("Urgente"), "Error: falta Urgente en TipoTicket");
  }
}
