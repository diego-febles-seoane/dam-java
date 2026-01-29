package com.docencia.herencia.ejercicio8;

import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
public class PagoTarjeta extends Pago {

    private String ultimos4;

    public PagoTarjeta(UUID id, double importe, String ultimos4) {
        super(id, importe);
        this.ultimos4 = ultimos4;
    }

    public String getUltimos4() {
        return ultimos4;
    }

    @Override
    public boolean requiereValidacion() {
        return true;
    }

    @Override
    public String toString() {
        return "PagoTarjeta{" +"id= "+getId()+
                "ultimos4='" + ultimos4 + '\'' +
                '}';
    }
}
