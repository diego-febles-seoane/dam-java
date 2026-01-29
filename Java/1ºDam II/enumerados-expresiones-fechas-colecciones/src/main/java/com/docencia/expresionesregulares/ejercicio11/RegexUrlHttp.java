package com.docencia.expresionesregulares.ejercicio11;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class RegexUrlHttp {

  private static final Pattern PATRON = Pattern.compile("\"^https?://[A-Za-z0-9.-]+(:[0-9]{1,5})?(/.*)?$\"");

  private RegexUrlHttp() {}

  public static boolean esValido(String texto) {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  public static Pattern patron() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }


}
