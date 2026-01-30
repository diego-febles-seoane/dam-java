package com.docencia.expresionesregulares.ejercicio5;

import java.util.regex.Pattern;

public final class RegexEmailSimple {

  private static final Pattern PATRON = Pattern.compile("\"^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$\"");

  private RegexEmailSimple() {}

  public static boolean esValido(String texto) {
    
    throw new UnsupportedOperationException("TODO");
  }

  public static Pattern patron() {
    
    throw new UnsupportedOperationException("TODO");
  }


}
