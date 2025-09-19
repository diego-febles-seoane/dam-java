package es.ies.puerto.cinco;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import es.ies.puerto.cuatro.Producto;

public class Inventario {
    private List<Producto> productos;
    private String nombre;

    public Inventario(){
        productos = new ArrayList<>();
        nombre = "mi nombre";
    }
    
    public boolean crear(Producto producto){
        if(producto == null){
            return false;
        }
        if(productos.contains(producto)){
            return false;
        }

        return productos.add(producto);
    }

    @Override
    public String toString(){
        String mensaje= this.nombre;
        mensaje += " :" +productos.toString();
        return mensaje;
    }
    
}
