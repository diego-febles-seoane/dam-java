import java.util.Scanner;

public class Ejercicio2 {
    /**
     * Batman necesita saber si tiene suficiente combustible para su Batmóvil. El
     * Batmóvil puede recorrer hasta 500 km con su tanque lleno. Si la distancia es
     * mayor a 500 km, debe imprimir
     * "¡Combustible insuficiente, alerta a Alfred!". Si la distancia es menor o
     * igual a 500 km, imprime
     * "Combustible suficiente para la misión".
     * 
     * @ahutor aday-ctr
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese la distancia a recorrer");
        int distancia = scanner.nextInt();
        if (distancia > 500) {
            System.out.println("¡Combustible insuficiente, alerta a Alfred!");
        } else {
            System.out.println("Combustible suficiente para la misión");
        }

    }
}
