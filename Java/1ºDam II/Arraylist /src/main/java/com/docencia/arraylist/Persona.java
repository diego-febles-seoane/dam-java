package com.docencia.arraylist;

public class Persona {
    String id;
    String nombre;

    public Persona (String id){
        this.id = id;
    }

    public Persona (String id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            "}";
    }

}
