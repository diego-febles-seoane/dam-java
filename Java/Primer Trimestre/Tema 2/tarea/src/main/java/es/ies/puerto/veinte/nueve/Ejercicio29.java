package es.ies.puerto.veinte.nueve;

public class Ejercicio29 {
    public static void main(String[] args) {
        Estanteria estanteria1 = new Estanteria(5);
        Libro libro3 = new Libro(1950, "J.R.R. Tolkien","The Hobbit");
        Libro libro1 = new Libro( 1954, "J.R.R. Tolkien","El Señor de los Anillos");
        Libro libro2 = new Libro(1955, "J.R.R. Tolkien","La Comunidad del Anillo");
        Libro libro4 = new Libro(1956, "J.R.R. Tolkien","Al Retorno del Rey");
        estanteria1.agregarLibro(libro3);
        estanteria1.agregarLibro(libro1);
        estanteria1.agregarLibro(libro2);
        estanteria1.agregarLibro(libro4);
        estanteria1.ordenarLibros();
        System.out.println(estanteria1);
    }
}
