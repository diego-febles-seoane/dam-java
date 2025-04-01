package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio19_3 {
    /**
    * Si tienes más de 500 minerales y más de 300 gas, puedes construir un coloso. Si no tienes suficientes recursos, construyes un marine.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Cantidad de minerales: ");
        int minerales = scanner.nextInt();
        System.out.println("Cantidad de gas: ");
        int gas = scanner.nextInt();
        if (minerales > 500 && gas > 300){
            System.out.println("Puedes construir un coloso");
            }else{
                System.out.println("No puedes construir un coloso, construyes un marine");
                }
                }
                }