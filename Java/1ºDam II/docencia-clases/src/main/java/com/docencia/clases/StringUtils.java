package com.docencia.clases;

import java.util.Arrays;

/**
 * @author diegofeblesseoane
 * @version 1.0.0
 */
public class StringUtils {

    /**
     * Funcion que normaliza una cadena de texto
     * @param cadena String que se pretende normalizar
     * @return String de texto normalizada
     */
    public static String normalizaNombre(String cadena) {
        if (cadena == null || cadena.isEmpty()){
            return cadena;
        }
        cadena = cadena.trim().toLowerCase();
        char primeraLetra = cadena.charAt(0);
        String primeraLetraStr = String.valueOf(primeraLetra);
        String primeraLetraMayuscula = primeraLetraStr.toUpperCase();
        cadena = cadena.replaceFirst(primeraLetraStr, primeraLetraMayuscula);
        return cadena;
    }

    /**
     * Funcion que cuenta el numero de letras y las consonantes en una cadena
     * @param cadena String con la cadena de entrada
     * @return Array con el numero de volcales y consonantes
     */
    public static int[] cuentaLetras(String cadena) {
        int[] resultado = new int[2];
        int letras = 0;
        int vocales = 0;
        if (cadena == null || cadena.isEmpty()){
            return resultado;
        }
        cadena = cadena.trim().toLowerCase();
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter >= 'a' && caracter <= 'z'){
                letras++;
            }
            if (caracter == 'a' || caracter == 'e' || 
            caracter == 'i' || caracter == 'o' || caracter == 'u'){
                vocales++;
            }
        }
        resultado[0] = vocales;
        resultado[1] = letras - vocales; 
        System.out.println("["+resultado[0]+ ", "+resultado[1]+"]");
        return resultado;
    }

    public static boolean esPalindromo(String cadena) {
        return false;
    }

    public static String acronimo(String frase) {
        return null;
    }

    public static void main(String[] args) {
    int[] resultado = cuentaLetras("Hola 123");
    System.out.println(Arrays.toString(resultado));
    }
}