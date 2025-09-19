package es.ies.puerto.veinte.siete;

public class Ejercicio27 {
    public static void main(String[] args) {
        Planeta planeta = new Planeta("Curio", 23, 45);
        System.out.println(planeta);
        System.out.println("Su gravedad en la superficie es de: " + planeta.gravedad());
    }
}
