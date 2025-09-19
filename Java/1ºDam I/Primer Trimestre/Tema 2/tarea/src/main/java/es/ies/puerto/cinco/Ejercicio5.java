package es.ies.puerto.cinco;

public class Ejercicio5 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El señor de los anillos", "J.R.R. Tolkien", 700);
        Libro libro2 = new Libro("El señor de los anillos", "J.R.r Tolkien", 500);
        System.out.println("Libro 1: ");
        System.out.println(libro1);
        if(libro1.equals(libro2)){
            System.out.println("Son iguales");
        }
        else{
        System.out.println("Libro 2: ");
        System.out.println(libro2);
        }
    }
}
