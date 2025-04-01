package es.ies.puerto.once;

import java.util.ArrayList;
import java.util.List;

public class Concesionario {
    private String nombre;
    private List<Vehiculo> vehiculos;

    public Concesionario(){
        vehiculos = new ArrayList<>();
        //Vehiculo[10]
        
    }
    public Concesionario(String nombre){
        this.nombre = nombre;
        vehiculos = new ArrayList<>();
        //Vehiculo[10]
        
    }
    //+
    public boolean agregar(Vehiculo vehiculo){
        if (vehiculo == null){
            return false;
        }
        if (vehiculos.contains(vehiculo)){
            return false;
        }
        return vehiculos.add(vehiculo);
    }

    public boolean eliminar(Vehiculo vehiculo){
        if (vehiculo == null){
            return false;
        }
        vehiculos.remove(vehiculo);
        return true;
    }

    
    public Vehiculo obtener(Vehiculo vehiculo){
        if (vehiculo == null){
            return null;
        }
        int posicion = vehiculos.indexOf(vehiculo);
        return vehiculos.get(posicion);
    }
    public Vehiculo obtener(String matricula){
        Vehiculo vehiculoBuscar = new Vehiculo(matricula);
        return obtener(vehiculoBuscar);
    }

    public boolean actualizar(Vehiculo vehiculoActualizar){
        int posicion = vehiculos.indexOf(vehiculoActualizar);
        if (vehiculoActualizar == null){
            return false;
        }
        if (posicion < 0){//indexOf retorna -1
            return false;
        }
        vehiculos.set(posicion, vehiculoActualizar);
        return true;
    }

    @Override
    public String toString(){
        return "{Nombre: " +nombre+", Vehiculos:"+vehiculos+ "}";
    }
}
