package com.docencia.expresionesregulares.ejercicio2;

import java.util.regex.Pattern;

public final class RegexPalabraMinusculas {

  private static final Pattern PATRON = Pattern.compile("\"^[a-z]{3,10}$\"");

  private RegexPalabraMinusculas() {}

  public static boolean esValido(String texto) {
    /**
    String copia = texto.toString();
    if (copia.length() < 3 || copia.length() > 10){
      return false;
    }
    String minuscula = copia.toLowerCase();
    if (minuscula.equals(texto)){
      return true;
    }
    return false;
    */
    return Pattern.matches("^[a-z]{3,10}$", texto);
  }

  public static Pattern patron() {
    return Pattern.compile("^[a-z]{3,10}$");
  }


}
