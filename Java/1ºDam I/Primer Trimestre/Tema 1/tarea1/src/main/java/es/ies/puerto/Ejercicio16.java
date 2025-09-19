package es.ies.puerto;

public class Ejercicio16 {

    /**
    * Declara dos variables de tipo int y realiza una división entre ambas. Muestra el resultado de la división entera y el residuo.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    public static void main(String[] args) {
        int variable1 = 3;
        int variable2 = 2;
        int division = variable1 / variable2;
        int residuo = variable1 % variable2;
        System.out.println("El resultado de la division es: " +division+ " y el resto es: " +residuo);
    }
}