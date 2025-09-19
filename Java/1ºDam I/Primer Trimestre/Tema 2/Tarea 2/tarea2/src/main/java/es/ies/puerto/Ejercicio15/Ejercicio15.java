package es.ies.puerto.Ejercicio15;

/**
 * Crea un objeto de la clase Producto con nombre "Laptop", precio 1000, y stock
 * 50. Asegúrate de que el precio no sea negativo y que el stock no sea menor a
 * 0. 
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1000, 50);
        System.out.println(producto);

        producto.setPrecio(-500);
        producto.setStock(-10);
        System.out.println("Comprobamos en negativo");
        System.out.println(producto);
    }
}
