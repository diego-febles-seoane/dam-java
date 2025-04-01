package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */

public class Ejercicio15 {
    static List<List<String>> listas = new java.util.ArrayList<>();
    static int electronica = 0;
    static int libro = 1;
    static int ropa = 2;

    public static void main(String[] args) {
        listas.add(crearLista());
        listas.add(crearLista());
        listas.add(crearLista());
        addProducto(listas.get(ropa), "pantalon");
        addProducto(listas.get(ropa), "calcetin");
        addProducto(listas.get(ropa), "camiseta");
        addProducto(listas.get(electronica), "cascos");
        addProducto(listas.get(electronica), "pantalla");
        addProducto(listas.get(electronica), "raton");
        System.out.println(listas);
        System.out.println(moverProducto(listas.get(ropa), listas.get(libro), "camiseta"));
        System.out.println(listas);

    }

    static List<String> crearLista() {
        return new ArrayList<>();
    }
    static boolean addProducto(List<String> lista, String producto){
        if (lista == null){
            return false;
        }
        if (producto == null){
            return false;
        }
        return lista.add(producto);
    }

    static boolean removeLista(List<String> lista, String producto){
        if (lista == null || lista.isEmpty()){
            return false;
        }
        if (producto == null){
            return false;
        }
        return lista.remove(producto);
    }

    static boolean moverProducto(List<String> listaOrigen, List<String> listaDestino, String producto){
        if(!listaOrigen.contains(producto) || listaDestino.contains(producto)){
            return false;
        }
        removeLista(listaOrigen, producto);
        return addProducto(listaDestino, producto);
    }


    static boolean deleteListaEmpty(List<List<String>> lista, int posicion){
        if (lista == null || lista.isEmpty()){
        return false;
        }
        if (lista.get(posicion).isEmpty()){
            lista.remove(posicion);
            return true;
        }
        
        return false;
    }
}