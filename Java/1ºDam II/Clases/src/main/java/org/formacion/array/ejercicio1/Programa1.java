package org.formacion.array.ejercicio1;

public class Programa1 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana", 25);
        System.out.println("Persona 1 "+persona1);
        Persona persona2 = new Persona("Antonio", 25);
        System.out.println("Persona 2 "+ persona2);
        if (persona1.equals(persona2)){
            System.out.println("Somos la misma persona");
        }
    }
}
