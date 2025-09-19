package es.ies.puerto.treinta.cinco;

public class Ejercicio35 {
    public static void main(String[] args){
        Bebida bebida1 = new Bebida("cocacola", 1.50, "Grande");
        Bebida bebida2 = new Bebida("coca-cola", 1.50, "Grande");
        System.out.println(bebida1);
        System.out.println(bebida2);
        System.out.println("¿Tienen el mismo tamaño? " + bebida1.equals(bebida2));
    }
}
