package es.ies.puerto.diez.diez;

public class Ejercicio10 {
    public static void main(String[] args) {
        Pila pila = new Pila(10);

        pila.apilar(10);
        System.out.println("Se añade el 10");
        System.out.println(pila);
        pila.apilar(20);
        System.out.println("Se añade el 20");
        System.out.println(pila);
        pila.apilar(30);
        System.out.println("Se añade el 30");
        System.out.println(pila);

        pila.desapilar();
        System.out.println("Se desapila el elemento superior");
        System.out.println(pila);
    }
}
