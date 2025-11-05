package com.docencia.programacion;

public class Ejercicio15 {
    private final String name;
    private final int age;

    public Ejercicio15(String name, int age) {
        // TODO asignar campos
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult() {
        if(age >= 18){
            return true;
        }
        return false;
    }
}
