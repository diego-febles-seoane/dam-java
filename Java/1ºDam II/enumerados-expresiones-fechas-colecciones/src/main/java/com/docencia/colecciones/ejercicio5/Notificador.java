package com.docencia.colecciones.ejercicio5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Notificador {

  public Map<String, Integer> contarPorCanal(List<Mensaje> mensajes) {
    Map<String, Integer> out = new HashMap<>();
    if (mensajes == null) return out;
    for (Mensaje m : mensajes) {
      out.put(m.getCanal(), out.getOrDefault(m.getCanal(), 0) + 1);
    }
    return out;
  }

  public Set<String> destinosUnicos(List<Mensaje> mensajes) {
    Set<String> out = new HashSet<>();
    if (mensajes == null) return out;
    for (Mensaje m : mensajes) {
      out.add(m.destino());
    }
    return out;
  }
}
