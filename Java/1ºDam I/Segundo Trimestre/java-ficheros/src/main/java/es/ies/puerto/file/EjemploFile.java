package es.ies.puerto.file;

import java.io.File;

public class EjemploFile {
    public static void main(String[] args) {
        String path = "C:/ejemplos/archivo.txt";
        path = "/Users/jpexposito/Downloads/java-ficheros/src/main/resources/archivo.txt";
        File archivo = new File(path);
        // Verifica si el archivo existe
        if (archivo.exists()) {
            System.out.println("El archivo existe.");
        } else {
            System.out.println("El archivo no existe.");
        }

    }    

}