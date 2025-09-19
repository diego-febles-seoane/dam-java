package es.ies.puerto.dos;
/**
 * Crea una clase Producto con los atributos id, nombre y precio, y cantidad. Implementa el método equals() 
 * para comparar dos productos según su nombre y precio, y también toString() para mostrar su información.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Producto producto1 = new Producto("45DHer5", "Pinguino de peluche", 25.95f, 1);
        Producto producto2 = new Producto("6ghr3", "Cocodrilo gigante de peluche ", 35.95f, 1);

        System.out.println("Producto 1" +  producto1);
        System.out.println("Producto 2" + producto2);

        System.out.println("¿Son iguales? " + producto1.equals(producto2));
    }
}
