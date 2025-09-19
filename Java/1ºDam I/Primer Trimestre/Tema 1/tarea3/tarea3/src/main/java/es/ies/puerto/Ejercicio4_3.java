package es.ies.puerto;

import java.util.Scanner;

public class Ejercicio4_3 {
    /**
    * Si eres un Sith o un Jedi, puedes usar la Fuerza. Si no, eres un simple mortal.
    * @author diego-febles-seo
    * @version 1.0.1
    */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("¿Eres un Sith o un Jedi?: ");
        String respuesta = scanner.nextLine();
        if(respuesta.equalsIgnoreCase("sith") || respuesta.equalsIgnoreCase("jedi")){
            System.out.println("Puedes usar la Fuerza");
            }else{
                System.out.println("Eres un simple mortal");
                }
            }
        }
                