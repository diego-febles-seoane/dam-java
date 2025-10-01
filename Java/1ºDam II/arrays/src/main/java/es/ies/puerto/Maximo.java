package es.ies.puerto;

/**
 * Busca el numero mas grande
 * @author diegofeblesseoane
 * @version 1.0.0
 */
public class Maximo {
    public static void main(String[] args) {
        int[] numeros = {4,7,5,9,24,8,31,3,110,66};
        int maximo = numeros[0];

        for (int i = 1; 1 < numeros.length;i++) {
            if (numeros[i] > maximo){
                maximo = numeros[i];
            }
            
            System.out.println("Maximo = "+maximo);
        }

    }
}
