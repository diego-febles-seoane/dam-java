package es.ies.puerto;

public class Ejercicio11 {
    /**
    * Los héroes han bebido una poción mágica que multiplica su poder de ataque. Escribe un programa que multiplique cada valor de ataque en el array por un valor escalar (el poder de la poción).
    * @author diego-febles-seone
    * @version 1.0.0
    */
    public static void main(String[] args) {
        int[] poderesDeAtaque = {50, 70, 100}; 
        int pocion = 2;
        int[] poderesDeAtaqueConPocion = new int[poderesDeAtaque.length];
        for (int i = 0; i < poderesDeAtaque.length; i++){
            poderesDeAtaqueConPocion[i] = poderesDeAtaque[i]* pocion;
            }
            System.out.println("Poderes de ataque con la poción:");
            for (int i = 0; i < poderesDeAtaqueConPocion.length; i++) {
                System.out.println(poderesDeAtaqueConPocion[i]);
        }
    }
}
