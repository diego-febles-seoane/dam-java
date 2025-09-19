package es.ies.puerto.veinte.cinco;

public class Concesionario {
    private Vehiculo[] vehiculos;
    private int numVehiculos;

    /**
     * Constructor general
     */
    public Concesionario(){
    }

    /**
     * Constructor de numVehiculos
     * @param numVehiculos
     */
    public Concesionario(int  numVehiculos){
    this.vehiculos = new Vehiculo [numVehiculos];
    this.numVehiculos = 0;
    }

    public boolean agregarVehiculo(Vehiculo vehiculo){
        if (numVehiculos >= vehiculos.length){
            return false;
        }
        vehiculos[numVehiculos] = vehiculo;
        this.numVehiculos++;
        return true;
        
    }


    @Override
    public String toString() {
        String mensaje = "";
        
        for (int i= 0 ; i < vehiculos.length; i++){
            mensaje += vehiculos[i];
        }
        return "{" +
            ", numVehiculos='" + numVehiculos + "'" + mensaje;
    }

}   
