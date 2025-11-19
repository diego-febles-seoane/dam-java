package com.docencia.clases;

import java.util.ArrayList;
import java.util.List;


public class Concesionario {
    final List<Coche> coches;
    Coche[] arrayCoche = new Coche[5];

    public Concesionario() {
        coches = new ArrayList<>(); 
    }

    public boolean addCoche(Coche coche) {
        if (coche == null ||
            coche.getMatricula() == null ||
                coche.getMatricula().isEmpty()) {
            return false;
        }
        if (coches.contains(coche)) {
            return true;
        }
        coches.add(coche);
        return true;
    }

    public boolean deleteCoche(List<Coche> cochesRemove){
        if (cochesRemove == null){
            return false;
        }
        return coches.removeAll(cochesRemove);
    }

    public List<Coche> cochesOrdenadosPorModelo(){
        coches.sort(java.util.Comparator.comparing((Coche c) -> c.getModelo(), java.util.Comparator.reverseOrder()));
        return coches;
    }

    public List<Coche> cochesOrdenadosPorMatricula(){
        coches.sort(java.util.Comparator.comparing((Coche c) -> c.getMatricula(), java.util.Comparator.reverseOrder()));
        return coches;
    }

    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();
        Coche coche1 = new Coche("1111 ABC");
        Coche coche2 = new Coche("0111 ABC");
        Coche coche3 = new Coche("3111 ZBC");
        concesionario.addCoche(coche1);
        concesionario.addCoche(coche2);
        concesionario.addCoche(coche3);
        //List<Coche> cochesOrdenadosPorMatricula = concesionario.cochesOrdenadosPorMatricula();
        //System.out.println(cochesOrdenadosPorMatricula);
        Coche coche4 = new Coche("4111 ABC");
        List<Coche> cochesBorrar = new ArrayList<>();
        cochesBorrar.add(coche1);
        cochesBorrar.add(coche2);
        cochesBorrar.add(coche3);
        concesionario.deleteCoche(cochesBorrar);
    }
}
