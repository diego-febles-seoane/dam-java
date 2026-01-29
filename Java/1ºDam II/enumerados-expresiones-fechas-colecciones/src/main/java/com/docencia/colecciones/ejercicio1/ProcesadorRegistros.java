package com.docencia.colecciones.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public final class ProcesadorRegistros {

  public List<Registro> filtrarPorTipo(List<Registro> registros, String tipo) {
    List<Registro> out = new ArrayList<>();
    if (registros == null || tipo == null) return out;

    for (Registro r : registros) {
      if (tipo.equalsIgnoreCase(r.tipo())) {
        out.add(r);
      }
    }
    return out;
  }

  public int sumarNumeros(List<Registro> registros) {
    if (registros == null) return 0;
    int suma = 0;
    for (Registro r : registros) {
      if (r instanceof RegistroNumero rn) {
        suma += rn.getValor();
      }
    }
    return suma;
  }
}
