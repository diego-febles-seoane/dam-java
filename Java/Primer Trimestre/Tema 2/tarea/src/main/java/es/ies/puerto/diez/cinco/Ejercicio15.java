package es.ies.puerto.diez.cinco;

public class Ejercicio15 {
    public static void main(String[] args) {
        Coordenada punto1 = new Coordenada(3, 4);
        Coordenada punto2 = new Coordenada(6, 8);
        System.out.println("El punto 1 con coordenadas:");
        System.out.println(punto1);
        System.out.println("Se encuentra a "+punto1.distancia(punto2)+" unidades del punto con coordenadas:");
        System.out.println(punto2);
        if(punto1.equals(punto2)) {
            System.out.println("Los puntos son iguales.");
        }
    }
}
