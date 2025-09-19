package es.ies.puerto;
import java.util.Scanner;

public class Ejercicio3_3 {
    /**
    * Cada día de la semana en tu nave espacial hay una actividad diferente. Los lunes entrenas combate, los miércoles pilotaje, y los viernes reparaciones. El resto de días descansas. 
    * @author diego-febles-seo
    * @version 1.0.1
    */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce dia de la semana: ");
        String diaSemana = scanner.nextLine();
            if  (diaSemana == "Lunes") {
                System.out.println("entrenas combate");
            } else if (diaSemana == "Martes") {
                System.out.println("descansas");
            } else if (diaSemana == "Miercoles") {
                System.out.println("pilotaje");
            } else if (diaSemana == "Jueves") {
                System.out.println("descansas");
            } else if (diaSemana == "Viernes") {
                System.out.println("reparaciones");
            } else if (diaSemana == "Sabado") {
                System.out.println("descansas");
            } else if (diaSemana == "Domingo") {
                System.out.println("descansas");
             
                }
                }
                }
