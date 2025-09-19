package es.ies.puerto.veinte.dos;

public class Ejercicio22 {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("Producto 1", 10.5f, 100);
        articulo1.aumentarStock(400);
        System.out.println(articulo1);
    }
}
