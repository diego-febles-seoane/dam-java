package org.formacion.array;

import java.util.Arrays;

public class EjerciciosArrays {

    private static int[] invertidos;

    /**
     * Dado un array, devuelve un nuevo array con los elementos en orden inverso.
     * @param array de elementos
     * @return array ordenado
     */
    public static int[] invertir(int[] array) {
        int tamanio = array.length;
        invertidos = new int[tamanio]; //{0,0,0,0}
        for (int i = 0; i< tamanio; i++) {
            invertidos[i] = array[tamanio-1-i];
        }
        return invertidos;
    }

    /**
     * Cuenta cuantos pares completos hay de cada color.
     * @param array de colores de los
     * @return
     */
    public static int  paresCalcetines(String[] colores, String color) {
        int pareja = 0;
        for (int i = 0; i < colores.length; i++) {
            if (colores[i].equals(color)){
                pareja++;
            }
            
        }
        return pareja/2;
    }


    /**
     * Quita duplicados manteniendo el primer ejemplar.
     * @param playlist
     * @return playlist sin duplicados
     */
    public static String[] sinRepetidos(String[] playlist) {
        return null;
    }

    /**
     * Rota un array k posiciones a la derecha.
     * @param array
     * @param k posiciones que debe de rotar
     * @return
     */
    public static int[] rotar(int[] array, int k) {
        int tamanio = array.length;
        int[] rotar = new int[tamanio];
        for (int posicion = 0; posicion < tamanio; posicion++){
        }
        return rotar;
    }

    /**
     * Devuelve un subarray desde índice i hasta j.
     * @param array
     * @param i posicion inicial
     * @param j posicion final
     * @return sub array
     */
    public static int[] rebanada(int[] array, int i, int j) {
        return null;
    }

    /**
     * Suma solo los numeros pares del array.
     * @param array de numeros
     * @return suma de los numeros pares
     */
    public static int sumaPares(int[] array) {
        return 0;
    }

    /**
     * Intercambia el primer y último elemento.
     * @param array de numeros de entrada
     * @return
     */
    public static int[] swapExtremos(int[] array) {
        return null;
    }

    /**
     * Devuelve los elementos comunes entre dos arrays.
     * @param primerArray
     * @param segundoArray
     * @return array con valores comunes
     */
    public static int[] interseccion(int[] primerArray, int[] segundoArray) {

        return null;
    }

    /**
     * Elementos que están en un array u otro, pero no en ambos.
     * @param arrayA
     * @param arrayB
     * @return array con la diferencia simetrica
     */
    public static int[] difSim(int[] arrayA, int[] arrayB) {
        return null;
    }

    /**
     * Comprueba si un array es palindromo.
     * @param array de entrada
     * @return true/false si es palindrome
     */
    public static boolean esPalindromo(int[] array) {
        return false;
    }

    /**
     * Busca el indice de un valor.
     * @param array de entrada 
     * @param objetivo del indice
     * @return posicion en la que se encuentra
     */
    public static int buscar(int[] array, int objetivo) {
        return -1;
    }

    /**
     * Elimina elementos en las posiciones dadas.
     * @param array de entrada
     * @param indices con las posiciones a liminar
     * @return array sin las posiciones dadas
     */
    public static int[] eliminarPorIndices(int[] array, int[] indices) {
        return null;
    }

    /**
     * Convierte una matriz en un array 1D.
     * @param matriz de entrada
     * @return array con la matriz aplanada
     */
    public static int[] aplanar2D(int[][] matriz) {
        return null;
    }

public static void main(String[] args) {

        System.out.println("Invertir: " + Arrays.toString(EjerciciosArrays.invertir(new int[]{1,2,3,4})));

        System.out.println("Pares de calcetines: " + EjerciciosArrays.paresCalcetines(new String[]{"rojo","azul","rojo","rojo","azul"}, "rojo"));

        System.out.println("Playlist sin repetidos: " + Arrays.toString(EjerciciosArrays.sinRepetidos(new String[]{"A","B","A","C","B"})));

        System.out.println("Rotación del carrusel: " + Arrays.toString(EjerciciosArrays.rotar(new int[]{1,2,3,4,5}, 2)));

        System.out.println("Rotación del carrusel: " + Arrays.toString(EjerciciosArrays.rebanada(new int[]{0,1,2,3,4}, 1, 4)));

        System.out.println("Suma de pares: " + EjerciciosArrays.sumaPares(new int[]{1,2,3,4,5,6}));

        System.out.println("Congelar extremos: " + Arrays.toString(EjerciciosArrays.swapExtremos(new int[]{10,20,30,40})));

        System.out.println(" Intersección: " + Arrays.toString(EjerciciosArrays.interseccion(new int[]{1,2,3,4}, new int[]{3,4,5})));
 
        System.out.println("Diferencia simétrica: " + Arrays.toString(EjerciciosArrays.difSim(new int[]{1,2,3}, new int[]{3,4,5})));

        System.out.println("Palíndromo: " + EjerciciosArrays.esPalindromo(new int[]{1,2,3,2,1}));

        System.out.println("Índice del tesoro: " + EjerciciosArrays.buscar(new int[]{10,20,30}, 20));

        System.out.println("Eliminación por índices: " + Arrays.toString(EjerciciosArrays.eliminarPorIndices(new int[]{1,2,3,4}, new int[]{1,3})));

    
        System.out.println("Aplanar Matriz: " + Arrays.toString(EjerciciosArrays.aplanar2D(new int[][]{{1,2},{3},{4,5}})));
    }
}
