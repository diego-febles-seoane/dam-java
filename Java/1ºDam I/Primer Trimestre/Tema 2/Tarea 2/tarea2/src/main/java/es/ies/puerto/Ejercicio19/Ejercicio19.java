package es.ies.puerto.Ejercicio19;

/**
 * Crea un objeto de la clase Circulo con radio 5. Muestra el área y el
 * perímetro del círculo.
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);

        double area = circulo.calcularArea();
        double perimetro = circulo.calcularPerimetro();
        System.out.println("Area: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}
