package com.docencia.programacion;

public class Ejercicio12 {
    public static int[] reversedArray(int[] original) {
        if (original == null) {
            return null;
        }
        int[] inverse = new int[original.length];
        for(int i = 0; i < original.length; i++) {
            inverse[i] = original[original.length -1 -i];
        }
        return inverse;
    }

    public static boolean containsValue(int[] array, int valueToFind) {
        if (array == null) {
            return false;
        }
        for(int i = 0; i < array.length; i++) {
            if (array[i] == valueToFind) {
                return true;
            }
        }
        return false;
    }
}
