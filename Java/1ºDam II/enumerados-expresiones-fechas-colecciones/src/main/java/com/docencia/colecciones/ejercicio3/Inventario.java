package com.docencia.colecciones.ejercicio3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Inventario {

  public Map<String, Producto> indexarPorSku(List<Producto> productos) {
    Map<String, Producto> out = new HashMap<>();
    if (productos == null) return out;
    for (Producto p : productos) {
      out.put(p.getSku(), p);
    }
    return out;
  }

  public Set<String> skusDuplicados(List<Producto> productos) {
    Set<String> vistos = new HashSet<>();
    Set<String> dup = new HashSet<>();
    if (productos == null) return dup;
    for (Producto p : productos) {
      String sku = p.getSku();
      if (!vistos.add(sku)) {
        dup.add(sku);
      }
    }
    return dup;
  }
}
