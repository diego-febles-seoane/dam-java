package es.ies.puerto.treinta.nueve;

public class Ejercicio22 {
    public static void main(String[] args) {
        Tienda tienda=new Tienda(5);
        Articulo articulo1 = new Articulo("Producto 1", 10.5f, 100);
        articulo1.aumentarStock(400);
        Articulo articulo2=new Articulo("Laptop", 2.4f, 4000);
        tienda.addArticulo(articulo1);
        tienda.addArticulo(articulo2);
        System.out.println(tienda);
        tienda.deleteArticulo(articulo2);
        System.out.println(tienda);
    }
}
