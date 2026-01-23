package com.docencia.herencia.ejercicio10;

import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
public class Contrato extends Documento {

    private String partes;

    public Contrato(UUID id, String titulo, String partes) {
        super(id, titulo);
        this.partes = partes;
}

    public String getPartes() {
        return partes;
    }

    @Override
    public String tipo() {
        return "Contrato";

    }

    @Override
    public String toString() {
        return "Contrato{" +"id="+getId()+
                "partes='" + partes + '\'' +
                '}';
    }
}
