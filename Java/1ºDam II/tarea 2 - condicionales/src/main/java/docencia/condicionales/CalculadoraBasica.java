package docencia.condicionales;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el primer numero: ");
        double numero1 = sc.nextDouble();

        System.out.print("Ingresa el segundo numero: ");
        double numero2 = sc.nextDouble();

        System.out.print("Ingresa que operacion quieres hacer con el simbolo: ");
        String operacion = sc.next();

        double resultado;

        switch (operacion) {
            case "+":
            System.out.println("Realizando la suma");
                resultado = numero1 + numero2;
                System.out.println("El resultado es: " + resultado);
                break;
            case "-":
            System.out.println("Realizando la resta");
                resultado = numero1 - numero2;
                System.out.println("El resultado es: " + resultado);
                break;
            case "*":
            System.out.println("Realizando la multiplicacion");
                resultado = numero1 * numero2;
                System.out.println("El resultado es: " + resultado);
                break;
            case "/":
            System.out.println("Realizando la division");
                if (numero2 == 0){
                    System.out.println("Operacion Invalida");
                } else {
                    resultado = numero1 / numero2; 
                System.out.println("El resultado es: " + resultado);
                }
                break;
            default:
                System.out.println("No se a introducido un simbolo valido");
        }
        sc.close();
    }
}
