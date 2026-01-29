package com.docencia.fechas.ejercicio9;

import java.time.DayOfWeek;
import java.time.LocalDate;

public final class FechasLocalDate9 {

  private FechasLocalDate9() {}

  public static DayOfWeek diaSemana(LocalDate d) {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  public static boolean esFinDeSemana(LocalDate d) {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  public static LocalDate siguienteLunes(LocalDate d) {
    LocalDate x = d;
    while (x.getDayOfWeek() != DayOfWeek.MONDAY) {
      x = x.plusDays(1);
    }
    return x;
  }
}
