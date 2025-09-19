package es.ies.puerto.cuarenta;

public class Ejercicio40 {
    public static void main(String[] args) {
        Biblioteca biblioteca=new Biblioteca(4);
        Libro libro1=new Libro("1234567890", 2021);
        Libro libro2=new Libro("uhruy345iutkhj", 2002);
        biblioteca.addLibro(libro2);
        biblioteca.addLibro(libro1);
        
        System.out.println();
        System.out.println(biblioteca);
    }
}
