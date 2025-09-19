package es.ies.puerto.map;


import java.util.HashMap;
import java.util.Map;

import es.ies.puerto.Articulo;

public class ArticuloMap {
    Map<String, Articulo> articulos;

    public ArticuloMap() {
        this.articulos = new HashMap<>();
    }

    public boolean agregar(Articulo articulo) {
        if (!articulos.containsKey(articulo.getCodigo())){
            articulos.put(articulo.getCodigo(), articulo);
            return true;
        }
        return false;
    }

    public Map<String, Articulo> listar() {
        return new HashMap<>(articulos);
    }

    public Articulo buscar(String codigo) {
        return articulos.get(codigo);     
    }

    public boolean actualizar(String codigo, Articulo nuevoArticulo) {
        if(articulos.containsKey(codigo)){
            articulos.put(codigo, nuevoArticulo);
            return true;
        }
        return false;
    }

    public boolean eliminar(String codigo) {
        if (articulos.containsKey(codigo)) {
            articulos.remove(codigo);
            return true;
        }
        return false;
    }
}
