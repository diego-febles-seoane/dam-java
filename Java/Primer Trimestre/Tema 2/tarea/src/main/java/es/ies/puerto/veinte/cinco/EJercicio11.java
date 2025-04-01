package es.ies.puerto.veinte.cinco;

public class EJercicio11 {
    static private Vehiculo vehiculo;
    public static void main(String[] args) {
        vehiculo=new Vehiculo("Toyota", "Corolla");
        vehiculo=new Vehiculo("Ford", "Mustang");
        System.out.println(vehiculo);
    }
}
