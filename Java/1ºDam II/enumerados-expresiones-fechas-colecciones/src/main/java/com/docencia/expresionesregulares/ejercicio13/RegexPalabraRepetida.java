package com.docencia.expresionesregulares.ejercicio13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class RegexPalabraRepetida {

  private static final Pattern PATRON = Pattern.compile("\\b(\\w+)\\b\\s+\\b\\1\\b", Pattern.CASE_INSENSITIVE);

  private RegexPalabraRepetida() {}

  public static boolean contieneRepeticion(String texto) {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  public static String primeraRepetida(String texto) {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  public static Pattern patron() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }
}
