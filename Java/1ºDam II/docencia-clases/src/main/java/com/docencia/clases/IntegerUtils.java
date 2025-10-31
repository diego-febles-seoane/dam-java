package com.docencia.clases;

/**
 * Clase que realizar la transformacion de valores enteros
 * @author diegofeblesseoane
 * @version 1.0.0
 */
public final class IntegerUtils {
    private IntegerUtils() {}

    /**
     * Funcion que transforma un valor numero en binario
     * @param x valor entero de entrada
     * @return String con el valor binario
     */
    public static String bin(int x) {
        return Integer.toBinaryString(x);
    }


    public static int popcount(int x) {
         return Integer.bitCount(x);
        }

    /**
     * Funcion que compara dos enteros con signos
     * @param a Valor de entrada a
     * @param b Valor de entrada b
     * @return 0 si a == b, -1 si a < b y 1 si a > b 
     */
    public static int comparaSinSigno(int a, int b) {
        return Integer.compareUnsigned(a, b);
    }

    public static void main(String[] args) {
        System.out.println("valor binario obtenido: " + comparaSinSigno(-2, 15));
    }
}
