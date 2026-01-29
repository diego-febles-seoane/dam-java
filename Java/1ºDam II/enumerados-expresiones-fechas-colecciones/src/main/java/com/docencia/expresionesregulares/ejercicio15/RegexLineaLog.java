package com.docencia.expresionesregulares.ejercicio15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class RegexLineaLog {

  // yyyy-mm-dd NIVEL Usuario=xxx Accion=yyy
  private static final Pattern PATRON = Pattern.compile("^([0-9]{4}-[0-9]{2}-[0-9]{2})\\s+(INFO|WARN|ERROR)\\s+Usuario=([A-Za-z0-9_]+)\\s+Accion=([A-Za-z0-9_]+)$");

  private RegexLineaLog() {}

  public static boolean esValida(String linea) {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  public static String nivel(String linea) {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  public static String usuario(String linea) {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  public static Pattern patron() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }
}
