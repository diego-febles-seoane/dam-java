package docencia.condicionales;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String mensaje = "Operacion no valida";

        System.out.print("Selecciona operacion: ");
        String operacion = sc.nextLine();

        System.out.print("Selecciona numero 1: ");
        double numero1 = sc.nextDouble();

        System.out.print("Selecciona numero 2: ");
        double numero2 = sc.nextDouble();

        switch (operacion) {
            case "+":
                mensaje = "Resultado: " + (numero1 + numero2);
                break;
            case "-":
                mensaje = "Resultado: " + (numero1 - numero2);
                break;
            case "*":
                mensaje = "Resultado: " + (numero1 * numero2);
                break;
            case "/":
                if (numero2 != 0) {
                    mensaje = "Resultado: " + (numero1 / numero2);
                } else {
                    mensaje = "Error: Division por cero";
                }
                break;
            default:
        }

        System.out.println(mensaje);

        sc.close();
    }
}
