package es.ies.puerto.diez.tres;

public class Ejercicio13 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Diego", 10, 9, 10);
        System.out.println("Alumno 1: " + alumno1);
        System.out.println("Promedio alumno 1: " + alumno1.promedio());
        Alumno alumno2 = new Alumno("Ana", 11, 8, 9);
        System.out.println("Alumno 2: " + alumno2);
        System.out.println("Promedio alumno 2: " + alumno2.promedio());
        System.out.println("¿Son iguales? " + alumno1.equals(alumno2));
        
    }
}
