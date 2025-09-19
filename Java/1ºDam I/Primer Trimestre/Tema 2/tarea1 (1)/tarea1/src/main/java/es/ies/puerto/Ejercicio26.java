package es.ies.puerto;

public class Ejercicio26 {
/**
 * Compara el poder de pelea de Goku (9000) con el de Vegeta (8500) usando el método Integer.compare().
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    public static void main(String[] args) {
        int poderGoku = 9000;
        int poderVegeta = 8500;
        int resultado = Integer.compare(poderGoku, poderVegeta);
        if (resultado > 0) {
            System.out.println("Goku tiene un poder de pelea mayor que Vegeta.");
        } else if (resultado < 0) {
            System.out.println("Vegeta tiene un poder de pelea mayor que Goku.");
        } else {
            System.out.println("Goku y Vegeta tienen el mismo poder de pelea.");
        }
    }
}