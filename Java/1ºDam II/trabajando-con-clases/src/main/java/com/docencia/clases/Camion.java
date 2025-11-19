package com.docencia.clases;

public class Camion implements IVehiculo{

    @Override
    public String sonido() {
        return ("plof");
    }

    @Override
    public int numeroRuedas() {
        return 8;
    }

    @Override
    public int numeroPuertas() {
        return 2;
    }

}
