package es.ies.puerto.diez.ocho;

public class Ejercicio18 {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        System.out.println("Circulo: " + circulo1);
        System.out.println("Area del circulo: " + circulo1.area());
        System.out.println("Perimetro de circulo: " + circulo1.perimetro());
        Circulo circulo2 = new Circulo(4);
        System.out.println("Circulo: " + circulo2);
        System.out.println("Area del circulo: " + circulo2.area());
        System.out.println("Perimetro de circulo: " + circulo2.perimetro());
        System.out.println("El radio de los circulos es igual: " + circulo1.equals(circulo2));
    }
}
