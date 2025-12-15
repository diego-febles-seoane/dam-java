package com.docencia.herencia.ejercicio13;


import java.util.List;


public abstract class Vehiculo {
    private final String marca;
    private final int velocidadMaxima;

    protected Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public abstract boolean esRapido();
}
