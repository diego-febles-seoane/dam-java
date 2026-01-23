package com.docencia.interfaces.ejercicio7;

import java.util.Objects;
import java.util.UUID;

/**
 * @author Héctor
 * @version 1.0.0
 */
/**
 * Implementacion concreta de Exportable.
 */
public class CsvExporter implements Exportable {

    private UUID id;
    private String separador;
    private int columnas;

    public CsvExporter(UUID id, String separador, int columnas) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.separador = separador;
        this.columnas = columnas;
    }

    public UUID getId() {
        return id;
    }

    public String getSeparador() {
        return separador;
    }

    public int getColumnas() {
        return columnas;
    }

    @Override
    public String exportar() {
        return "CSV(" + columnas + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CsvExporter that = (CsvExporter) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "CsvExporter{" +
                "id=" + id +
                ", separador='" + separador + '\'' +
                ", columnas=" + columnas +
                '}';
    }
}
