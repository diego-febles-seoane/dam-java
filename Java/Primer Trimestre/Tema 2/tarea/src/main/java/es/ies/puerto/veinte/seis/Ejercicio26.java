package es.ies.puerto.veinte.seis;

public class Ejercicio26 {
    public static void main(String[] args) {
    Biblioteca biblioteca1=new Biblioteca(4);
    Libro libro1=new Libro(400, "pedro", "pedro");
    Libro libro2=new Libro(300, "juan", "juan");
    biblioteca1.agregarLibro(libro1);
    biblioteca1.agregarLibro(libro2);
    biblioteca1.eliminarLibro(libro2);
    System.out.println(biblioteca1);
    }
}
