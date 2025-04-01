import java.util.Scanner;

public class Ejercicio5 {
    /**
     * Frodo está en una misión para destruir el Anillo. Si Frodo tiene una espada,
     * puede luchar contra los Orcos, con el mensaje "Frodo luchará contra los
     * Orcos., de lo contrario, debe huir, mostrando el mensaje "Frodo huirá.". El
     * programa debe preguntar si Frodo tiene una espada y mostrar el resultado
     * correspondiente.
     * 
     * @ahutor aday-ctr
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¿Frodo tiene una espada?");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Frodo luchará contra los Orcos.");
        } else {
            System.out.println("Frodo huirá.");
        }

    }
}
