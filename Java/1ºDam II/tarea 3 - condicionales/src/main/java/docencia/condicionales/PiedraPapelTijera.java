package docencia.condicionales;

import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String mensaje = "Elemento invalido";

        System.out.print("Eleccion juggador 1: ");
        String jugador1 = sc.nextLine().toLowerCase();

        System.out.print("Eleccion juggador 2: ");
        String jugador2 = sc.nextLine().toLowerCase();

        switch (jugador1) {
            case "tijera":
                if (jugador2 == "tijera"){  
                    mensaje = "Empate";
                } else if (jugador2 == "piedra") {
                    mensaje = "Jugador 2 gana";
                } else if (jugador2 == "papel"){
                    mensaje = "Jugador 1 gana";
                }
                break;
            case "piedra":
                if (jugador2 == "tijera"){  
                    mensaje = "Jugador 1 gana";
                } else if (jugador2 == "piedra") {
                    mensaje = "Empate";
                } else if (jugador2 == "papel"){
                    mensaje = "Jugador 2 gana";
                }
                break;
            case "papel":
                if (jugador2 == "tijera"){  
                    mensaje = "Jugador 2 gana";
                } else if (jugador2 == "piedra") {
                    mensaje = "Jugador 1 gana";
                } else if (jugador2 == "papel"){
                    mensaje = "Empate";
                }
                break;
            default:
                
        }

        System.out.println(mensaje);

        sc.close();
    }
}
