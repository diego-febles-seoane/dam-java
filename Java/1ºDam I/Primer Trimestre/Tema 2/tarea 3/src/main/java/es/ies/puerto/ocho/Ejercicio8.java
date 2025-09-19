package es.ies.puerto.ocho;

public class Ejercicio8 {
     public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion(2, 3);
        Fraccion fraccion2 = new Fraccion(4, 6);
        System.out.println("Fraccion 1: " + fraccion1);
        System.out.println("Fraccion 2: " + fraccion2);
        System.out.println("Suma: " + fraccion1.sumar(fraccion2));
        System.out.println("Resta: " + fraccion1.restar(fraccion2));
        System.out.println("Multiplicación: " + fraccion1.multiplicar(fraccion2));
        Fraccion fraccion3 = fraccion1.dividir(fraccion2);
        System.out.println("División: " + fraccion3);
        
     }
}
