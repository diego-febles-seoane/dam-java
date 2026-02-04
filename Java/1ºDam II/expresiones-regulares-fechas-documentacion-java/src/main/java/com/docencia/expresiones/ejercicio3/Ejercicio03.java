package com.docencia.expresiones.ejercicio3;

import java.util.regex.Pattern;

/**
* 3) EMAIL 
 *    - Validar email basico: sin espacios, una sola '@', dominio con al menos un '.'.
 *      (No es RFC completo).
 *    Válidos:   "a@b.com", "user.name+tag@sub.domain.es"
 *    Inválidos: "a@@b.com", "a@b", "a b@c.com", "@b.com", "a@.com"
 *
 */
public class Ejercicio03 {

    

  public static boolean isValidEmail(String email) {
    String exRegular = "^[a-zA-Z0-9+_\\.]+@([a-zA-Z]+\\.)?([a-zA-Z]+\\.[a-zA-Z]{2,})$";
   if (email == null || email.isBlank()){
    return false;
   }
   return Pattern.matches(exRegular, email);
  }
}

