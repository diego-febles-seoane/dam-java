package com.docencia.clases.ejercicio3;

import java.time.LocalDate;

public class Factura {

    private final String numeroFactura;
    private final String iban;
    private final String nifEmpresa;
    private final LocalDate fechaEmision;
    private final LocalDate fechaVencimiento;

    public Factura(String numeroFactura, String iban, String nifEmpresa, LocalDate fechaEmision,
            LocalDate fechaVencimiento) {
        this.numeroFactura = numeroFactura;
        this.iban = iban;
        this.nifEmpresa = nifEmpresa;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
    }

    public void validate() {
        throw new UnsupportedOperationException("TODO");
    }

    public boolean isVencida(LocalDate hoy) {
        throw new UnsupportedOperationException("TODO");
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public String getIban() {
        return iban;
    }

    public String getNifEmpresa() {
        return nifEmpresa;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
}
