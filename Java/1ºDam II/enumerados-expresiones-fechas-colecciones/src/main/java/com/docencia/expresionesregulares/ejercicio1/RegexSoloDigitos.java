package com.docencia.expresionesregulares.ejercicio1;

import java.util.regex.Pattern;

public final class RegexSoloDigitos {

  private static final Pattern PATRON = Pattern.compile("\"^[0-9]+$\"");
  Pattern pattern = null;
  
  private RegexSoloDigitos() {
  }

  public static boolean esValido(String texto) {
    String patron = "^[0-9]+$";
    return Pattern.matches(patron, texto);
  }

  public static Pattern patron() {
    return Pattern.compile("^[0-9]+$");
  }


}
