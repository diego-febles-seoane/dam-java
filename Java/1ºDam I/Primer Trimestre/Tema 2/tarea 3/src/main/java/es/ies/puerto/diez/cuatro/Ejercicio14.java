package es.ies.puerto.diez.cuatro;

public class Ejercicio14 {
    public static void main(String[] args) {
        Coordenada coordenadas = new Coordenada(20, 10);
        System.out.println("Coordenadas: (" + coordenadas.getX() + ", " + coordenadas.getY() + ")");
        coordenadas.setX(30);
        System.out.println("Nuevas coordenadas: (" + coordenadas.getX() + ", " + coordenadas.getY() + ")");
        System.out.println("Distancia: " + coordenadas.distancia(new Coordenada(10, 20)));
        coordenadas.desplazar(Math.toRadians(45), 10);
        System.out.println("Desplazamiento: (" + coordenadas.getX() + ", " + coordenadas.getY() + ")");
    }
}
