package es.ies.puerto.dos;

public class ejercicio2 {

    public static void main(String[] args) {
        Producto producto1=new Producto("P001", "Manzana", 1.5f, 100);
        Producto producto2=new Producto("P001", "Manzana", 1.5f, 100);
        System.out.println(producto1.equals(producto2));
        if (producto1.equals(producto2)) {
            System.out.println("Son iguales");
        }
        else{
        System.out.println(producto1);
        System.out.println(producto2);
        }    
    }
}
