package docencia.condicionales;

import java.util.Scanner;

public class NotasEscolares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mensaje = "Nota no valida";

        System.out.print("Ingresa la nota: ");
        int nota = sc.nextInt();

        if (nota < 5){
            mensaje = "Suspenso";
        } else if (5 <= nota){
            mensaje = "Aprobado";
        } else if (7 <= nota){
            mensaje = "Notable";
        } else if ((9<= nota)&&(nota < 10)){
            mensaje = "Sobresaliente";
        }

        System.out.println(mensaje);
        sc.close();
    }
}
