package docencia.condicionales;

import java.util.Scanner;

public class CajeraAutomatica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String mensaje = "Opcion no valida";
        float saldo = 0; 

        System.out.print("Saldo de cuenta: ");
        float saldo = sc.nextFloat();

        System.out.print("Selecciona operacion: ");
        String operacion = sc.nextLine();

        switch (operacion) {
            case "ingreso":
                System.out.print("Cantidad a ingresar: ");
                float ingreso = sc.nextFloat();
                if (ingreso > 0) {
                    saldo += ingreso;
                    mensaje = "Ingreso realizado. Saldo actual: " + saldo;
                } else {
                    mensaje = "Cantidad invalida";
                }
                break;
            case "retirada":
                System.out.print("Cantidad a retirar: ");
                float retirada = sc.nextFloat();
                if (retirada > 0 && retirada <= saldo) {
                    saldo -= retirada;
                    mensaje = "Retirada realizada. Saldo actual: " + saldo;
                } else if (retirada > saldo) {
                    mensaje = "Saldo insuficiente";
                } else {
                    mensaje = "Cantidad invalida";
                }
                break;
            case "consulta":
                mensaje = "Saldo actual: " + saldo;
                break;
            default:
                
        }
        
        System.out.println(mensaje);
        sc.close();
    }
}
