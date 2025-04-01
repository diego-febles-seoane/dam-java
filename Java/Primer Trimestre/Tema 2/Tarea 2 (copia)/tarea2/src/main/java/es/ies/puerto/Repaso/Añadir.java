package es.ies.puerto.Repaso;

public class Añadir {
    String[] productos;
    int tamanio;


    public Añadir(){}

    public Añadir(String[] productos, int tamanio){
        
        this.tamanio = tamanio;
    }
    

    boolean agregar (Producto producto){
        
        productos[tamanio] = productoAgregar;
        tamanio++;


        return true;
    }
}
