package es.ies.puerto.seis;

public class Ejercicio6 {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan", "123456", 9.5f);
        Estudiante estudiante2 = new Estudiante("Juan", "123454", 8.7f);
        System.out.println("Estudiante 1: ");
        System.out.println(estudiante1);
        if(estudiante1.equals(estudiante2)){
            System.out.println("Son la misma persona");
        }
        else{
            System.out.println("Estudiante 2: ");
            System.out.println(estudiante2);
        }
    }
}
