package es.ies.puerto;
import java.util.Scanner;

public class Ejercicio2_3 {
    /**
    * Eres un guerrero de nivel 5. Si obtienes más de 50 puntos de experiencia, subes a nivel 6. Si no, te quedas en nivel 5.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce la cantidad de experiencia: ");
        int experiencia = scanner.nextInt();
        if (experiencia > 50) {
            System.out.println("Has subido de nivel a nivel 6");
            } else {
                System.out.println("Te quedas en nivel 5");
                scanner.close();
                }
            }
        }
