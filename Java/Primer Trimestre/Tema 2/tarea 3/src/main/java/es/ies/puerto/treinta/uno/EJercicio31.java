package es.ies.puerto.treinta.uno;

public class EJercicio31 {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Pulp Fiction", "Quentin Tarantino", 120);
        Pelicula pelicula2 = new Pelicula("Inception", "Christopher Nolan", 150);
        System.out.println("Pelicula 1: " + pelicula1);
        System.out.println("¿Tienen la misma duración? " + pelicula1.equals(pelicula2));
    }
}
