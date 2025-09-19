package es.ies.puerto;

public class Ejercicio9 {
    /**
    * En una batalla épica, dos ejércitos se han unido. Escribe un programa que sume los puntos de fuerza de los guerreros de dos ejércitos y muestre un nuevo array con las fuerzas combinadas de ambos.
    * @author diego-febles-seoane
    * @version 1.0.0
    */
    public static void main(String[] args) {
        int[] ejercito1 = {50, 60, 70};
        int[] ejercito2 = {40, 80, 60};
        int[] ejercitoUnido = new int[ejercito1.length + ejercito2.length];
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < ejercito1.length; i++) {
            ejercitoUnido[i] = ejercito1[i];
            suma += ejercito1[i];
            contador++;
            }
            for (int i = 0; i < ejercito2.length; i++) {
                ejercitoUnido[contador] = ejercito2[i];
                suma += ejercito2[i];
                contador++;
                }
                System.out.println("El ejercito unido tiene una suma de fuerza de: " + suma);
                System.out.println("El ejercito unido tiene las siguientes fuerzas: ");
                for (int i = 0; i < ejercitoUnido.length; i++)
                System.out.println(ejercitoUnido[i]);
                }
                }