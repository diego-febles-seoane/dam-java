package com.docencia.expresionesregulares.ejercicio10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class RegexTelefonoEs {

  private static final Pattern PATRON = Pattern.compile("\"^(\\+34\\s?)?[6-9][0-9]{2}(\\s?[0-9]{3}){2}$\"");

  private RegexTelefonoEs() {}

  public static boolean esValido(String texto) {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  public static Pattern patron() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }


}
