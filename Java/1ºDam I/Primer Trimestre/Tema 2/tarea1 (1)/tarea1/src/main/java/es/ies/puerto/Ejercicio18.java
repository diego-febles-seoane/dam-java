package es.ies.puerto;

public class Ejercicio18 {
/**
 * Dadas las masas de dos planetas y la distancia entre ellos, calcula la fuerza gravitacional entre ellos usando la fórmula de la Ley de Gravitación Universal y Math.pow().
 * @author diego-febles-seoane
 * @version 1.0.0
 */
    public static void main(String[] args) {
        double G = 6.674 * Math.pow(10, -11);
        double masa1 = 5.97 * Math.pow(10, 24);
        double masa2 = 7.35 * Math.pow(10, 22);
        double distancia = 3.844 * Math.pow(10, 8);
        double fuerza = G * (masa1 * masa2) / Math.pow(distancia, 2);
        System.out.println("La fuerza gravitacional entre los dos planetas es: " + fuerza + " N");
    }   
}    
