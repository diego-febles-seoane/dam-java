package com.docencia.herencia.ejercicio10;

import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
public class Factura extends Documento {

    private String numero;

    public Factura(UUID id, String titulo, String numero) {
        super(id, titulo);
        this.numero = numero;
}

    public String getNumero() {
        return numero;
    }

    @Override
    public String tipo() {
        return "Factura";
    }

    @Override
    public String toString() {
        return "Factura{" +"id="+getId()+
                "numero='" + numero + '\'' +
                '}';
    }
}
