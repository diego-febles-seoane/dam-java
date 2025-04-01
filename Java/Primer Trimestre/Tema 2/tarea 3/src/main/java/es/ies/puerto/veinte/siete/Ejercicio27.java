package es.ies.puerto.veinte.siete;

public class Ejercicio27 {
    public static void main(String[] args) {
        Planeta planeta = new Planeta("TierraPremium", 1000, 1000);
        System.out.println("Planeta " + planeta);
        System.out.println("Gravedad del planeta " + planeta.calcularGravedad());
    }
}
