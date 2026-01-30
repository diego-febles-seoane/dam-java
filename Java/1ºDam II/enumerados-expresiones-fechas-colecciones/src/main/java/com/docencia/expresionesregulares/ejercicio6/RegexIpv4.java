package com.docencia.expresionesregulares.ejercicio6;

import java.util.regex.Pattern;

public final class RegexIpv4 {

  private static final Pattern PATRON = Pattern.compile("\"^((25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})$\"");

  private RegexIpv4() {}

  public static boolean esValido(String texto) {
    
    throw new UnsupportedOperationException("TODO");
  }

  public static Pattern patron() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }


}
