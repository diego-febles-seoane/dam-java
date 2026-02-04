package com.docencia.expresiones.ejercicio2;

import java.util.regex.Pattern;

/**
 * 2) FECHA FORMATO (YYYY-MM-DD) (solo formato, no calendario)
 *    - Validar que tenga 4 dígitos, guion, 2 dígitos, guion, 2 dígitos,
 *      con mes 01–12 y día 01–31 (sin comprobar meses de 30/31 ni bisiestos).
 *    Válidos:   "2025-01-09", "1999-12-31"
 *    Inválidos: "2025-1-09", "2025-13-01", "2025-00-10", "abcd-ef-gh"
 *  
 */
public class Ejercicio02 {


  public static boolean isValidDateFormat(String text) {
   String exRegular = "^[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$";
   if (text == null || text.isBlank()){
    return false;
   }
   return Pattern.matches(exRegular, text);
  }
}
