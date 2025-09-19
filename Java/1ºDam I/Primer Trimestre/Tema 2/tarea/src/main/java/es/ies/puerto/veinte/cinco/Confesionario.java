package es.ies.puerto.veinte.cinco;
/**
 * Crea una clase Concesionaria con una lista (array) (array) de vehículos (clase Vehiculo). 
 * Implementa métodos para agregar vehículos, listar todos los vehículos y usar toString() para mostrar detalles.
 * @author emsantamaria
 * @version 1.0.0
 */
public class Confesionario {
    private Vehiculo[] vehiculos;
    private int numVehiculos;
    public Confesionario(){

    }
    public Confesionario(int numVehiculos){
        this.vehiculos=new Vehiculo[numVehiculos];
        this.numVehiculos=0;
    }
    public boolean addVehiculo(Vehiculo vehiculo){
        if(numVehiculos<vehiculos.length){
            vehiculos[numVehiculos]=vehiculo;
            numVehiculos++;
            return true;
        }
            return false;
       
        }
    public boolean eliminarVehiculo(Vehiculo vehiculo){
        return true;
    }
    @Override
    public String toString() {
        String mensaje="";
        for (int i = 0; i < this.numVehiculos; i++) {
              mensaje+=vehiculos[i];
        }
        return "{" +
            " Numero de Vehiculos='" + numVehiculos + "'}" +"/"+mensaje+
            "";
    }
    
}