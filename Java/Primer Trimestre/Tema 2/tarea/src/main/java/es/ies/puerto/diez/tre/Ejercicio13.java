package es.ies.puerto.diez.tre;

public class Ejercicio13 {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Juan", 20, 1.8f, 75);
        System.out.println(alumno);
        System.out.println("Su promedio es: ");
        System.out.println(alumno.promedio());
    }
}
