package com.docencia.fechas.ejercicio18;

import java.time.DayOfWeek;
import java.time.LocalDate;

public final class FechasLaborables18 {

  private FechasLaborables18() {}

  public static boolean esLaborable(LocalDate d) {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  public static LocalDate sumarDiasLaborables(LocalDate d, int dias) {
    LocalDate x = d;
    int restantes = dias;
    while (restantes > 0) {
      x = x.plusDays(1);
      if (esLaborable(x)) restantes--;
    }
    return x;
  }

  public static int contarLaborables(LocalDate inicio, LocalDate finExclusivo) {
    int c = 0;
    LocalDate x = inicio;
    while (x.isBefore(finExclusivo)) {
      if (esLaborable(x)) c++;
      x = x.plusDays(1);
    }
    return c;
  }
}
