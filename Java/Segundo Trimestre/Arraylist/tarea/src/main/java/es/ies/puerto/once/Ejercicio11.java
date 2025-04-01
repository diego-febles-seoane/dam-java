package es.ies.puerto.once;

public class Ejercicio11 {
    static Concesionario renault;

    public static void main(String[] args) {
        renault = new Concesionario("Renault");
        Vehiculo dacia = new Vehiculo("Logan","Renault", "1234abc");
        Vehiculo dacia2 = new Vehiculo("Logan","Renault", "1235abc");
        Vehiculo dacia3 = new Vehiculo("Logan","Renault", "1236abc");
        renault.agregar(dacia);
        renault.agregar(dacia2);
        
        System.out.println("Soy el renault:"+renault);
        
        renault.eliminar(dacia3);
        
        System.out.println();
        System.out.println("Soy el renault:"+renault);
    }


}
