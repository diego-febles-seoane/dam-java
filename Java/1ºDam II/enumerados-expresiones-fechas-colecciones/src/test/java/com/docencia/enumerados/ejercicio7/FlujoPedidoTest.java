package com.docencia.enumerados.ejercicio7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FlujoPedidoTest {

  @Test
  void debeTenerCincoEstados() {
    assertEquals(5, EstadoPedido.values().length, "Error: EstadoPedido debe tener 5 valores");
  }

  @Test
  void puedeEnviarDebeSerTrueCuandoPagado() {
    FlujoPedido f = new FlujoPedido();
    assertTrue(f.puedeEnviar(EstadoPedido.Pagado), "Error: Pagado debe poder enviarse");
  }

  @Test
  void puedeCancelarDebeSerFalseCuandoEntregado() {
    FlujoPedido f = new FlujoPedido();
    assertFalse(f.puedeCancelar(EstadoPedido.Entregado), "Error: Entregado no debe poder cancelarse");
  }

  @Test
  void siguienteDebeAvanzarDeEnviadoAEntregado() {
    FlujoPedido f = new FlujoPedido();
    assertEquals(EstadoPedido.Entregado, f.siguiente(EstadoPedido.Enviado), "Error: Enviado debe pasar a Entregado");
  }

  @Test
  void debeContenerCancelado() {
    assertEquals(EstadoPedido.Cancelado, EstadoPedido.valueOf("Cancelado"), "Error: falta Cancelado en EstadoPedido");
  }
}
