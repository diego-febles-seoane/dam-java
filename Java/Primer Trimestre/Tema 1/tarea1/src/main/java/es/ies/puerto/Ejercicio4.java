package es.ies.puerto;

/**
 * Declara una variable de tipo boolean que indique si una persona es mayor de edad (true o false). Asigna un valor y muéstralo por pantalla.
 * @author diego-febles-seo
 * @version 1.0.1
 */
public class Ejercicio4 {
    static int MAYOR_EDAD = 18;
    public static void main(String[] args) {
        int edad = 18;
        
        if (edad >= MAYOR_EDAD){
            System.out.println("Eres mayor de mayor");
        
        }else{
            System.out.println("Eres menor de edad");
        }
        
       
    }
}