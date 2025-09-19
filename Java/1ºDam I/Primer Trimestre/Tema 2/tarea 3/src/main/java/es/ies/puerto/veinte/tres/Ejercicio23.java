package es.ies.puerto.veinte.tres;
import es.ies.puerto.dos.Producto;


public class Ejercicio23 {
    static Producto[] productos;

    public static void main(String[] args) {
        productos = new Producto[2];
        for ( int i = 0; i < productos.length; i++) {
            int valor = i+1;
            Producto producto = new Producto("id"+valor, "nombre"+valor,10*valor,1*valor);
            productos[i] = producto;    
        }
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
