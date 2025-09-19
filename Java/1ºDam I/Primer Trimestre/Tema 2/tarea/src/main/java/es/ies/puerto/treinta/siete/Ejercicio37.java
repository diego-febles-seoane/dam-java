package es.ies.puerto.treinta.siete;

public class Ejercicio37 {
    public static void main(String[] args) {
        Partido partido1=new Partido("Pedro", "Goku", "Gana Goku 2 a 0");
        System.out.println(partido1);
        partido1.actualizarResultado("Gana Goku 2 a 1");
        System.out.println(partido1);
    }
}
