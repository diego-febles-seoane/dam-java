package com.docencia.enumerados.ejercicio7;

public final class FlujoPedido {

  public boolean puedeEnviar(EstadoPedido e) {
    return e == EstadoPedido.Pagado;
  }

  public boolean puedeCancelar(EstadoPedido e) {
    return e == EstadoPedido.Creado || e == EstadoPedido.Pagado;
  }

  public EstadoPedido siguiente(EstadoPedido e) {
    return switch (e) {
      case Creado -> EstadoPedido.Pagado;
      case Pagado -> EstadoPedido.Enviado;
      case Enviado -> EstadoPedido.Entregado;
      case Entregado, Cancelado -> e;
    };
  }
}
