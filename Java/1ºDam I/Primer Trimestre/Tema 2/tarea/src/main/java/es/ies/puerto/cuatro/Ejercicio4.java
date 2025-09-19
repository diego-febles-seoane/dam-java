package es.ies.puerto.cuatro;

public class Ejercicio4 {
    public static void main(String[] args) {
        Rectangulo rectangulo1=new Rectangulo(5, 10);
        Rectangulo rectangulo2=new Rectangulo(5, 10);
        System.out.println("Rectangulo1: ");
        System.out.println(rectangulo1);
        System.out.println("El perímetro del rectángulo1 es: " + rectangulo1.perimetro());
        System.out.println("El área del rectángulo1 es: " + rectangulo1.area());
        if(rectangulo1.equals(rectangulo2)){
            System.out.println("Los rectangulos son iguales");
        }
        else{
            System.out.println("Recatangulo2: ");
            System.out.println(rectangulo2);
            System.out.println("El area del rectangulo2 es: "+rectangulo2.area());
            System.out.println("El perímetro del rectángulo2 es: "+rectangulo2.perimetro());
        }
    }
}
