package docencia.condicionales;

import java.util.Scanner;

public class RelojDigital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mensaje = "Horario no valido";

        System.out.print("Ingresa la hora: ");
        int hora = sc.nextInt();

        if ((6< hora) && (hora <11)){
            mensaje = "Buenos dias";
        } else if ((12< hora) && (hora <19)){
            mensaje = "Buenas tardes";
        }else if ((20< hora) && (hora <23) || (0< hora) && (hora <5) ){
            mensaje = "Buenas noches";
        }

        System.out.println(mensaje);
        sc.close();
    }
}
