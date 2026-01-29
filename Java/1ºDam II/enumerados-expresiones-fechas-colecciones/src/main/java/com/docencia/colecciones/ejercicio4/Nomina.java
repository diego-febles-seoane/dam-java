package com.docencia.colecciones.ejercicio4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Nomina {

  public double calcularPagoTotal(List<Empleado> empleados) {
    if (empleados == null) return 0.0;
    double total = 0.0;
    for (Empleado e : empleados) {
      total += e.pago();
    }
    return total;
  }

  public Map<String, List<Empleado>> agruparPorTipo(List<Empleado> empleados) {
    Map<String, List<Empleado>> out = new HashMap<>();
    if (empleados == null) return out;
    for (Empleado e : empleados) {
      out.computeIfAbsent(e.tipo(), k -> new ArrayList<>()).add(e);
    }
    return out;
  }
}
