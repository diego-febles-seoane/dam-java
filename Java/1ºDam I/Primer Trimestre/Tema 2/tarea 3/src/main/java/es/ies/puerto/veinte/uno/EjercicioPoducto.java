package es.ies.puerto.veinte.uno;

public class EjercicioPoducto {
    
    public static void main(String[] args) {
    Producto producto1=new Producto("id", "nombre", 5, 2);
    Producto producto2=new Producto("id", "nombre", 5, 2);
        System.out.println("Producto1: "+ producto1);
        System.out.println("Producto2: "+ producto2);

    System.out.println("¿Son iguales? "+ producto1.equals(producto2));


    }

}
