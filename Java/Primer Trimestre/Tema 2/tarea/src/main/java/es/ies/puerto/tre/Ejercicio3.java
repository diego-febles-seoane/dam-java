package es.ies.puerto.tre;

public class Ejercicio3 {
    public static void main(String[] args) {
        Coche coche=new Coche("Mustang", "Pedro", 2001, 40);
        System.out.println(coche);
        System.out.println("El coche ha acelerado");
        coche.acelerar(200);
        System.out.println(coche);
        System.out.println("El coche ha empezado a frenar");
        coche.frenar(50);
        System.out.println(coche);
    }
}
