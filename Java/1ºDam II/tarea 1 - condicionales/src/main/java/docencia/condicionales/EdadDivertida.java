package docencia.condicionales;

import java.util.Scanner;
/**
 * Según la edad, el programa da un mensaje gracioso.
 * @author diegofeblesseoane
 * @version 1.0.0
 */
public class EdadDivertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mensaje = "Leyenda viva Sabes mas que Google";

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        if (edad < 5){
            mensaje = "Eres un bebé genio con teclado";
        } else if (edad < 13){
            mensaje = "Cuidad Podrias estar en la fase gamer pro";
        } else if (edad <20){
            mensaje = "adolescente detectado: nivel experto en memes";
        } else if (edad < 60){
            mensaje = "Adulto en misión: sobrevivir al café diario.";
        } 

        System.out.println(mensaje);

        sc.close();
    }
}
