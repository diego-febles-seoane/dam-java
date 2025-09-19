package es.ies.puerto.veinte.veinte;

public class Ejercicio20 {
    public static void main(String[] args) {
        Factura factura1 = new Factura("Caja", 2, 0.50);
        System.out.println("Factura: " + factura1);
        System.out.println("Factura total: " + factura1.total());
    }
}
