package es.ies.puerto.diez.seis;

public class Ejercicio16 {
    static Fecha  fecha1;
    static Fecha  fecha2;
    public static void main(String[] args) {
        fecha1 = new Fecha(29,10,2024);
        fecha2 = new Fecha(30,10,2024);

        System.out.println("Fecha: " +fecha1);
        System.out.println("Fecha: " +fecha2);

        System.out.println("La fechas son iguales: " +  fecha1.equals(fecha2));
    }
}
