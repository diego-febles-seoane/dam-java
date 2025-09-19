package es.ies.puerto.veinte.nueve;

public class Ejercicio17 {
    public static void main(String[] args) {
        Libro libro1=new Libro(300, "Pedro", "Pedro");
        Libro libro2=new Libro(200, "Pedro", "Pedro");
        System.out.println(libro1);
        if(libro1.equals(libro2)){
            System.out.println("Los libros son iguales");
         }
         else{
            System.out.println(libro2);
         }
}
}