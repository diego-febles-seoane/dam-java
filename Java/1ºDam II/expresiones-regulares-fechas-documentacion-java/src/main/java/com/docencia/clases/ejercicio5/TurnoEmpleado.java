package com.docencia.clases.ejercicio5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TurnoEmpleado {

    private static final String EMP_ID_REGEX = "^EMP-\\d{5}$";
    private static final String FRANJA_REGEX = "^\\d{2}:\\d{2}-\\d{2}:\\d{2}$";

    private final String empleadoId;
    private final LocalDate dia;
    private final LocalTime inicio;
    private final LocalTime fin;

    public TurnoEmpleado(String empleadoId, LocalDate dia, LocalTime inicio, LocalTime fin) {
        this.empleadoId = empleadoId;
        this.dia = dia;
        this.inicio = inicio;
        this.fin = fin;
    }

    public void validate() {
        throw new UnsupportedOperationException("TODO");
    }

    public String franja() {
        throw new UnsupportedOperationException("TODO");
    }

    public LocalDateTime inicioDateTime() {
        throw new UnsupportedOperationException("TODO");
    }

    public LocalDateTime finDateTime() {
        throw new UnsupportedOperationException("TODO");
    }

    public boolean cumpleDescansoMinimoDesde(TurnoEmpleado anterior, int minDescansoHoras) {
        throw new UnsupportedOperationException("TODO");
    }

    public String getEmpleadoId() {
        return empleadoId;
    }

    public LocalDate getDia() {
        return dia;
    }

    public LocalTime getInicio() {
        return inicio;
    }

    public LocalTime getFin() {
        return fin;
    }
}
