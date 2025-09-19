package es.ies.puerto;

public class Ifelse {
    public static void main(String[] args) {

        int temperatura = 0;
        if (temperatura > 25){
            System.out.println("A la playa!!!");
        } else {
            System.out.println("Tu padre va a ir a la playa con " + temperatura + " grados");
        }

        boolean haceSol = true;
        if (haceSol) {
            System.out.println("No te olvides la sombrilla");
        }

        boolean nevando = false;
        if (nevando || (temperatura >= -5 && temperatura <= 19)){
            System.out.println("Mucho frio a la cama");
        } else if (haceSol || temperatura > 24){
            System.out.println("XDDDDD");
        } else {
            System.out.println("No gracias");
        }
    }
}