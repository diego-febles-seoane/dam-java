package com.docencia.expresionesregulares.ejercicio14;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class RegexHashtags {

  private static final Pattern PATRON = Pattern.compile("(?<!\\w)#([A-Za-z0-9_]+)");

  private RegexHashtags() {}

  public static List<String> extraer(String texto) {
    List<String> out = new ArrayList<>();
    if (texto == null) return out;
    Matcher m = PATRON.matcher(texto);
    while (m.find()) {
      out.add(m.group(1));
    }
    return out;
  }

  public static boolean contiene(String texto, String tag) {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }

  public static Pattern patron() {
    // TODO: implementar este metodo
    throw new UnsupportedOperationException("TODO");
  }
}
