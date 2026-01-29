package com.docencia.enumerados.ejercicio9;

public final class ClasificadorTicket {

  public boolean requiereGuardia(TipoTicket tipo) {
    return tipo == TipoTicket.Urgente || tipo == TipoTicket.CaidaServicio;
  }

  public int tiempoObjetivoHoras(TipoTicket tipo) {
    return switch (tipo) {
      case Consulta -> 48;
      case Incidencia -> 24;
      case Urgente -> 4;
      case CaidaServicio -> 1;
    };
  }

  public boolean esTecnico(TipoTicket tipo) {
    return tipo == TipoTicket.Incidencia || tipo == TipoTicket.Urgente || tipo == TipoTicket.CaidaServicio;
  }
}
