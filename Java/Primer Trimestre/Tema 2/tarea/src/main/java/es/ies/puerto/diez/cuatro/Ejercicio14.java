package es.ies.puerto.diez.cuatro;

public class Ejercicio14 {
    public static void main(String[] args) {
        Poligono poligono1 = new Poligono(4, 5);
        Poligono poligono2 = new Poligono(2, 5);
        System.out.println(poligono1);
        System.out.println("Su area es: "+poligono1.area() + " cm²"  );
        if(poligono1.equals(poligono2)){
            System.out.println("Los poligonos son iguales");
        }
        else{
            System.out.println(poligono2);
            System.out.println("Su area es: "+poligono2.area() + " cm²"  );
        }
    }
}
