package com.docencia.expresiones.ejercicio1;

import java.util.regex.Pattern;

/**
 *
 * 1) HORA 24H (HH:MM)
 *  - Validar una hora en formato 24h entre 00:00 y 23:59.
 *    Válidos:   "00:00", "07:05", "23:59"
 *    Inválidos: "24:00", "12:60", "7:05", "aa:bb"
 */
public class Ejercicio01 {



  public static boolean isValidHora24h(String text) {
    String exRegular = "^([0-1][0-9]|2[0-3]):[0-5][0-9]$";
    if (text == null || text.isBlank()){
      return false;
    }
    return Pattern.matches(exRegular, text);
  }


}
