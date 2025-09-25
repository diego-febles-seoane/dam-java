package docencia.condicionales;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        double numero = sc.nextDouble();
        
        System.out.print("Ingresa a que queires convertir (Millas, Kilometros, Fahrenheit, Celsius): ");
        String conversion = sc.next().toLowerCase();

        double resultado;
        
        switch (conversion) {
            case "millas":
                resultado = numero * 0.621371;
                System.out.println(resultado + "En Millas");
                break;
            case "kilometros":  
                resultado = numero / 1.609344;
                System.out.println(resultado + " En kilometros");
                break;
            case "fahrenheit":  
                resultado = (numero * 1.8) + 32;
                System.out.println(resultado + "En fahrenheit");
                break;
            case "celsius":
                
                resultado = (numero - 32) / 1.8;
                System.out.println(resultado + "En celcius");
                break;
            default:
                System.out.println("No has seelccionado una convercion permitida");

        }

        sc.close();
    }
}
