package es.ies.puerto.diez.ocho;

public class Ejercicio18 {
    public static void main(String[] args) {
        Circulo circulo1=new Circulo(5);
        Circulo circulo2=new Circulo(7);
        System.out.println(circulo1);
        if(circulo1.equals(circulo2)){
            System.out.println("Los círculos son iguales");
         }
         else{
            System.out.println(circulo2);
        System.out.println("Area del circulo2= "+circulo2.area());
        System.out.println("Perimetro del circulo2= "+circulo2.perimetro());
        }
        System.out.println("Area del circulo1= "+circulo1.area());
        System.out.println("Perimetro del circulo1= "+circulo1.perimetro());
    }
}
