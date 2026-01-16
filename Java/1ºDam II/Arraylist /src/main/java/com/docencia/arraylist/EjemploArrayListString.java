package com.docencia.arraylist;

import java.util.ArrayList;

public class EjemploArrayListString {

    public static void main(String[] args) {
        // Crear un ArrayList de Strings
        ArrayList<String> listaDeNombres = new ArrayList<>();

        // Agregar elementos a la lista
        listaDeNombres.add("Juan");
        listaDeNombres.add("María");
        listaDeNombres.add("Carlos");

        // Imprimir elementos
        System.out.println("Lista de Nombres: " + listaDeNombres);

        // Obtener y modificar un elemento
        String nombre = listaDeNombres.get(1);
        System.out.println("Nombre en la posición 1: " + nombre);

        // Eliminar un elemento
        listaDeNombres.remove("María");
        System.out.println("Lista después de eliminar a María: " + listaDeNombres);
        
        System.out.println("Tengo en la posicion dos: " +listaDeNombres.get(2));
        System.out.println("Tengo en la posicion ultima " +listaDeNombres.get(listaDeNombres.size()-1));
    }
}
