package es.ies.puerto.veinte.ocho;

public class Ejercicio28 {
    public static void main(String[] args) {
        Ciudad ciudad = new Ciudad("Barcelona", "España", 400);
        Ciudad otraCiudad = new Ciudad("Madrid", "España", 400);
        System.out.println(ciudad);
        System.out.println(otraCiudad);
        System.out.println("¿Tienen la misma población? " + ciudad.equals(otraCiudad));
    }
}
