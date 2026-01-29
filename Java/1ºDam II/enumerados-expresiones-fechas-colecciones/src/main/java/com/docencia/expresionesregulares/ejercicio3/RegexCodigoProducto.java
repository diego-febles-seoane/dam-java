package com.docencia.expresionesregulares.ejercicio3;

import java.util.regex.Pattern;

public final class RegexCodigoProducto {

  private static final Pattern PATRON = Pattern.compile("\"^[A-Z]{3}-[0-9]{4}$\"");

  private RegexCodigoProducto() {}

  public static boolean esValido(String texto) {
    return Pattern.matches("^[A-Z]{3}-[0-9]{4}", texto);
  }

  public static Pattern patron() {
    return Pattern.compile("^[A-Z]{3}-[0-9]{4}");
  }


}
