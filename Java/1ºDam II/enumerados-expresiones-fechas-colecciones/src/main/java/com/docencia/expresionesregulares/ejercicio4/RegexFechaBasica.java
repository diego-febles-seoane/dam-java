package com.docencia.expresionesregulares.ejercicio4;

import java.util.regex.Pattern;

public final class RegexFechaBasica {

  private static final Pattern PATRON = Pattern.compile("\"^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/[0-9]{4}$\"");

  private RegexFechaBasica() {}

  public static boolean esValido(String texto) {
    return Pattern.matches("(0[1-9])", texto);
  }

  public static Pattern patron() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }


}
