import java.util.Scanner;

public class Ejercicio1 {
    /**
     * Un jedi está entrenando para aprender a usar la Fuerza. El nivel de poder de
     * la Fuerza se calcula sumando dos valores de concentración,
     * Si la suma de los niveles de concentración es mayor a 100, el programa debe
     * indicar que el Jedi ha alcanzaddo un nivel avanzado, mostrando
     * como salida "Nivel avanzado". Si es menor o igual a 100, el programa debe
     * indicar que el jedi aún es un aprendiz, mostrando en la salida
     * "Nivel de aprendiz".
     * 
     * @ahutor aday-ctr
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Ingrese el primer nivel de concentración");
        int nivel1 = scanner.nextInt();
        System.out.println("Ingrese el segundo nivel de concentración");
        int nivel2 = scanner.nextInt();
        int nivelFuerza = nivel1 + nivel2;
        if (nivelFuerza > 100) {
            System.out.println("Nivel avanzado");
        } else {
            System.out.println("Nivel de aprendiz");
        }

    }
}
