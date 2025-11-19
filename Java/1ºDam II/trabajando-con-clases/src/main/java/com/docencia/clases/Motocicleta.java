package com.docencia.clases;

public class Motocicleta extends Vehiculo {

    public Motocicleta (String matricula) {
        super("A", matricula);
    }

    @Override
    public String suSonido() {
        return "RumRum";
    }

}
