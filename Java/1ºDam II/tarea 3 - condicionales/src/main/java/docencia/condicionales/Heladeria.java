package docencia.condicionales;

import java.util.Scanner;

public class Heladeria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String mensaje = "No tenemos el sabor";

        System.out.print("Selecciona opcion de sabor: ");
        int sabor = sc.nextInt();

        switch (sabor) {
            case 1:
                mensaje = "Vainilla";
                break;
            case 2:
                mensaje = "Chocolate";
                break;
            case 3:
                mensaje = "Fresa";
                break;
            case 4:
                mensaje = "Menta";
                break;
            case 5:
                mensaje = "Dulce de leche";
                break;
            default:
                
        }

        System.out.println(mensaje);

        sc.close();
    }
}
