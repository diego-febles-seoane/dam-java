package com.docencia.clases;

public class Coche extends Vehiculo {

    public Coche(String matricula) {
        super("B", matricula);
    }

    @Override
    public String suSonido() {
        return "RonRon";
    }

    @Override
    public int numeroRuedas() {
        return 4;
    }

    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Motocicleta("1111 KFC");
        System.out.println(vehiculo1.suSonido());
        Vehiculo vehiculo2 = new Coche("2222 MDO");
        System.out.println(vehiculo2.suSonido());
        System.out.println("Numero ruedas de la motocicleta es:"+vehiculo1.numeroRuedas());
        System.out.println("Numero ruedas del coche es:"+vehiculo2.numeroRuedas());
    }

}
