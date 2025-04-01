package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 *  @author: diego-febles-seoane
 *  @version: 1.0.0
 */
public class Ejercicio9 {
    static Scanner scanner = new Scanner(System.in);
    static List<Integer> enteros = new ArrayList<>();
    static Vector<Integer> vector = new Vector<>(enteros);
    
    public static void main(String[] args) {
        System.out.println("Introduce numeros");
        crearVectorDinamico(vector);
        System.out.println(vector);
    }

    /**
     * Metodo que crea el vector dinamico
     * @param return 
     */
    static Vector<Integer> crearVectorDinamico(Vector<Integer> vector)
    {
        int numero = scanner.nextInt();
        while (numero != 0)
        {
            vector.add(numero);
            numero = scanner.nextInt();
        }
        return vector;
    }
}