package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio16 {
/**
 * Dado un número de experiencia XP como entero, determina cuántos niveles ha ganado un jugador si cada nivel requiere 500 XP (usa Math.floor()).
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de experiencia XP:");
        int xp = sc.nextInt();
        int niveles =  (int) Math.floor(xp / 500);
        System.out.println("El jugador ha ganado " + niveles + " niveles.");
        scanner.close();
    }
}