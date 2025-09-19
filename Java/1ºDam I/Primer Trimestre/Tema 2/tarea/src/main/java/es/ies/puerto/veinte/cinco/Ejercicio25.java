package es.ies.puerto.veinte.cinco;

public class Ejercicio25 {
    
public static void main(String[] args) {
    Confesionario confesionario=new Confesionario(5);
    Vehiculo vehiculo=new Vehiculo("Ford","Mustang");
    confesionario.addVehiculo(vehiculo);
    Vehiculo vehiculo1=new Vehiculo("Mercedez", "Benz");
    confesionario.addVehiculo(vehiculo1);
    Vehiculo vehiculo2=new Vehiculo("pedro", "pedro");
    confesionario.addVehiculo(vehiculo2);
    System.out.println(confesionario);
}
}
