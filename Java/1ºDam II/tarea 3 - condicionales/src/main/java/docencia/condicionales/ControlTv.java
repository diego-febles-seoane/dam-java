package docencia.condicionales;

import java.util.Scanner;

public class ControlTv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String mensaje = "No cofigurado";

        System.out.print("Selecciona un canal: ");
        int canal = sc.nextInt();

        switch (canal) {
            case 1:
                mensaje = "Deportes";
                break;
            case 2:
                mensaje = "Notricias";
                break;
            case 3:
                mensaje = "Peliculas";
                break;
            case 4:
                mensaje = "Dibujos Animados";
                break;
        }

        System.out.println(mensaje);

        sc.close();
    }
}
