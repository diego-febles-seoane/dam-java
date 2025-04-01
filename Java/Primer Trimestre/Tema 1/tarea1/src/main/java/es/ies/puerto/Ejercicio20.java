package es.ies.puerto;

public class Ejercicio20 {

    /**
    * Crea un programa que intercambie los valores de dos variables enteras. Por ejemplo, si la variable a vale 5 y b vale 10, después del intercambio a debería valer 10 y b 5.
    * @author diego-febles-seo
    * @version 1.0.0
    */
    public static void main(String[] args) {
        int variable1 = 1;
        int variable2 = 2;
        System.out.println("Antes del intecambio la variable 1 vale " +variable1+ " y la variable 2 vale " +variable2);
        int intercambio = variable1;
        variable1 = variable2;
        variable2 = intercambio;
        System.out.println("Y despues del intercambio variable 1 es " +variable1+ " y la variable 2 vale " + variable2);
    }
}