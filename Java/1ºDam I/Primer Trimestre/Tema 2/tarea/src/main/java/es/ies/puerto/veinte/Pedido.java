package es.ies.puerto.veinte;
import es.ies.puerto.veinte.uno.Producto;

public class Pedido {
    static Producto[] productos;

    public static void main(String[] args) {
        productos=new Producto[2];
        for (int i = 0; i < productos.length; i++) {
            int valor=i+1;
            Producto producto=new Producto("id"+valor, "Goku"+valor, 230*valor, 4*valor);
            productos[i]=producto;
        }
        for(Producto producto:productos){
            System.out.println(producto);
        }
    }
}
