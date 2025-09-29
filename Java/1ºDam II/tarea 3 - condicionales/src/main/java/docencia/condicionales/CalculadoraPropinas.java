package docencia.condicionales;

import java.util.Scanner;

public class CalculadoraPropinas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cuenta: ");
        float cuenta = sc.nextFloat();

        System.out.print("Ingresa la cantidad de porcentaje: ");
        float porcentaje = sc.nextFloat();

        float propina = cuenta * porcentaje / 100;
        float total = cuenta + propina;

        System.out.println("propina = " + propina + ", total = " + total);

        sc.close();
    }
}
