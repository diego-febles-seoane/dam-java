package es.ies.puerto;

public class Ejercicio22 {
/**
 * Dado un hechizo como "Expecto Patronum", crea un programa que verifique si comienza con "Expecto" y termina con "Patronum".
 * @author diego-febles-seoane
 * @version 1.0.0
 */

    public static void main(String[] args) {
        String hechizo = "Expecto Patronum";
        if (hechizo.startsWith("Expecto") && hechizo.endsWith("Patronum")) {
            System.out.println("El hechizo comienza con 'Expecto' y termina con  'Patronum'.");
            } else {
                System.out.println("El hechizo no cumple con las condiciones.");
                }
    }
}