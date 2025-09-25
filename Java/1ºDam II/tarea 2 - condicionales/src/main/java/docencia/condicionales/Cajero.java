package docencia.condicionales;

import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Que operacion quiere hacer: ");
        String operacion = sc.next().toLowerCase();
            
        if (operacion == "salir"){
            System.out.println("Has salido de la sesion");
        } else {
            System.out.print("Que cantidad de dinero: ");
            double dinero = sc.nextDouble();
        }
        
        double cambioSaldo = 0;
        double saldoActual = 0;
        
        switch (operacion) {
            case "Consultar":
                saldoActual = cambioSaldo;
                System.out.println(saldoActual);
                break;
            case "Depositar":  
                saldoActual = cambioSaldo + dinero;
                System.out.println(saldoActual);
                break;

            case "Retirar":  
                resultado = (numero * 1.8) + 32;
                System.out.println(resultado + "En fahrenheit");
                break;
            default:
                System.out.println("Operacion no valida");

        }

        sc.close();
    }
}
