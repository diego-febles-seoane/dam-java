package es.ies.puerto.cinco;

import es.ies.puerto.cuatro.Producto;

public class Ejercicio5 {
    public static void main(String[] args) {
        Producto lechuga = new Producto(1, "lechugas", 2, 1);
        Producto papas = new Producto(2, "papas", 2, 2);
        Producto lechuga2 = new Producto(1, "lechugas rojas", 2, 2);
        Inventario inventario = new Inventario();
        inventario.crear(lechuga);
        inventario.crear(papas);
        inventario.crear(lechuga2);
        inventario.crear(null);
        System.out.println(inventario);
    }
}