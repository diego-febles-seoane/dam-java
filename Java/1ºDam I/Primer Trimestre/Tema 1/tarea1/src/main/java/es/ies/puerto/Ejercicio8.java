package es.ies.puerto;

/**
 * Declara una variable de tipo float para almacenar el valor de pi (3.1416) y otra para el radio de un círculo.Calcula el área del círculo usando la fórmula Área = pi * radio * radio.
 * @author diego-febles-seo
 * @version 1.0.0
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        float pi = 3.1416f;
        float radio = 10.5f;
        float area = (radio*radio)*pi;
        System.out.println("El area es:" +area);
    }
}