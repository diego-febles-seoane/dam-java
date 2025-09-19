package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio7_2 {
    /**
    * Crea un programa que pida al usuario las horas trabajadas y el salario por hora, y luego calcule su salario semanal.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el numero de horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();
        
        System.out.print("Introduce el salario por hora: ");
        double salarioPorHora = scanner.nextDouble();
        
        double salarioSemanal = horasTrabajadas * salarioPorHora * 7;
        
        System.out.println("Tu salario semanal es: " + salarioSemanal);
        scanner.close();

    }
}