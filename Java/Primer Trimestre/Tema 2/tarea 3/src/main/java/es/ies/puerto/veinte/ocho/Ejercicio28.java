package es.ies.puerto.veinte.ocho;

public class Ejercicio28 {
    public static void main(String[] args) {
        Ciudad ciudad1 = new Ciudad("Fusland", "NewHalen", 1000);
        System.out.println("ciudad1: " + ciudad1);
        Ciudad ciudad2 = new Ciudad("Fusland", "NewHalen", 100);
        System.out.println("ciudad2: " + ciudad2);
        System.out.println("Comparacion de poblacion: " + ciudad1.equals(ciudad2));
    }
}
