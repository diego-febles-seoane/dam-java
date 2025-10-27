package es.ies.puerto;

import java.util.Arrays;

public class MiClase {
    static String miValor;
    public static void main(String[] args) {
        miValor = "es Es un valor";
        System.out.println("Imprimir un valor"+miValor.toLowerCase());
        if (miValor.startsWith("e") || miValor.startsWith("E")){
            System.out.println("Muestro un valor porque comienzo por e/E");
        if (miValor.toLowerCase().startsWith("e")){
            System.out.println("Muestro un valor porque comienzo por e");
        }
        miValor="esto Es un valor";
        String valorSinEspacios = miValor.replaceAll(" ", "");
        System.out.println(valorSinEspacios);
        System.out.println(valorSinEspacios.indexOf("s"));
        String[] miArray = miValor.split("%");
        System.out.println(Arrays.toString(miArray));
        }
    }
}