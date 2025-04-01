package es.ies.puerto.cuatro;

public class Ejercicio4 {
    public static void main(String[] args) {
        Producto producto = new Producto(1, "Laptop", 1200.00f, 10);
        System.out.print(producto);
        producto.actualizarStock(5);
        System.out.print(producto);
    }
}
