package com.docencia.programacion;

public class Ejercicio3 {
    /**
     * 
     * @param currentAge
     * @return
     */
    public static int ageNextYear(int currentAge) {
        if (currentAge < 0) {
            return 0;
        }
        return currentAge +1;
    }
    /**
     * 
     * @param age
     * @return
     */
    public static boolean isAdult(int age) {
        if (age < 18) {
            return false;
        }
        return true;
    }
}
