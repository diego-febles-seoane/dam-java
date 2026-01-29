package com.docencia.colecciones.ejercicio2;

import java.util.HashSet;
import java.util.Set;

public final class AgendaEventos {

  public boolean agregarSiNoExiste(Set<Evento> eventos, Evento nuevo) {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  public Set<String> nombresUnicos(Set<Evento> eventos) {
    Set<String> out = new HashSet<>();
    if (eventos == null) return out;
    for (Evento e : eventos) {
      out.add(e.getNombre().toLowerCase());
    }
    return out;
  }
}
