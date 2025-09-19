package es.ies.puerto.diez.siete;

public class Ejercicio17 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Harry Potter", "Yo", 120);
        System.out.println("Libro 1 " + libro1);
        Libro libro2 = new Libro("Harry Potter", "Yo", 110);
        System.out.println("Libro 2 " + libro2);
        System.out.println("Numero de paginas es igual: " +libro1.equals(libro2) );
    }
}
